import os
import sys
import json
from transformers import AutoModelForSequenceClassification, AutoTokenizer, pipeline

if len(sys.argv) < 2:
    sys.exit(-1)

# 감정을 분석할 메세지
message = sys.argv[1]

base_path = os.path.dirname(os.path.realpath(__file__))

# 카테고리 불러오기
with open(f"{base_path}/processed/category.json", "r") as f:
    category = json.load(f)

# 사전 학습된 모델 불러오기
model = AutoModelForSequenceClassification.from_pretrained(f"{base_path}/bert_sentimental/checkpoint-163930", num_labels=len(category))

# 토크나이저 
tokenizer = AutoTokenizer.from_pretrained('bongsoo/bert-small-kor-v1')

pipe = pipeline("text-classification", model, tokenizer=tokenizer)

# 추론하기
predictions = pipe(message)
pred = int(predictions[0]['label'].replace("LABEL_", ""))

print(category[pred])