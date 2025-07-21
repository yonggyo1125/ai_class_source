import json
import evaluate
import numpy as np
from transformers import AutoModelForSequenceClassification, AutoTokenizer
from datasets import load_dataset

# 로컬 데이터셋 불러오기
data = load_dataset("json", data_files="processed/data.json", split="train")
data = data.train_test_split(test_size=0.2, shuffle=True)

# 분류 가져오기
with open("processed/category.json", "r") as f:
    category = json.load(f)

# 한국어로 학습된 bert-small 베이스 모델 로드
bert_kor = AutoModelForSequenceClassification.from_pretrained('bongsoo/bert-small-kor-v1', num_labels=len(category))


# 토크나이저 
bert_kor_tokenizer = AutoTokenizer.from_pretrained('bongsoo/bert-small-kor-v1')

def tokenize(batch):
    return bert_kor_tokenizer(batch['document'], padding=True, truncation=True)

data_tokenized = data.map(tokenize, batched=True, batch_size=None)

# 훈련데이터, 테스트 데이터 분리
train_data = data_tokenized['train']
test_data = data_tokenized['test']


# 성능 지표 만들기
metrics = evaluate.load("accuracy")

def compute_metrics(eval_pred):
    logits, labels = eval_pred
    predictions = np.argmax(logits, axis=-1)
    return metrics.compute(predictions=predictions, references=labels)

# 훈련 매개변수 준비하기
from transformers import TrainingArguments, Trainer

training_args = TrainingArguments(output_dir="bert_sentimental",
                                num_train_epochs=10,
                                eval_strategy='epoch',
                                save_strategy='epoch',
                                logging_steps=len(train_data) // 16,
                                load_best_model_at_end=True,
                                report_to='none')


# 사전 훈련된 BERT 모델 미세 튜닝
trainer = Trainer(model=bert_kor,
                train_dataset=train_data,
                eval_dataset=test_data,
                args=training_args,
                compute_metrics=compute_metrics)
trainer.train()