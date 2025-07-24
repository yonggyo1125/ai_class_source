import os
import json
import pymysql
import time
from transformers import AutoModelForSequenceClassification, AutoTokenizer, pipeline


base_path = os.path.dirname(os.path.realpath(__file__))

# 카테고리 불러오기
with open(f"{base_path}/processed/category.json", "r") as f:
    category = json.load(f)

# 사전 학습된 모델 불러오기
model = AutoModelForSequenceClassification.from_pretrained(f"{base_path}/model", num_labels=len(category))

# 토크나이저 
tokenizer = AutoTokenizer.from_pretrained('bongsoo/bert-small-kor-v1')

pipe = pipeline("text-classification", model, tokenizer=tokenizer)

# DB 연결
conn = pymysql.connect(
    host="localhost",
    user="STUDY_JPA",
    password="1234",
    db="STUDY_JPA",
    charset="utf8"
)

cursor = conn.cursor(pymysql.cursors.DictCursor) # pymysql.cursors.DictCursor // 결과를 딕셔너리 형태로 변환해줌
sql = "SELECT seq, content FROM SENTIMENTAL_TEST WHERE done IS NULL OR done = 0"

while True:
    try:
        time.sleep(1)
        
        cursor.execute(sql)
        items = cursor.fetchall() 
       
        for item in items:
            analysis = []
            for message in item['content'].split("\n"):
                # 추론하기 
                predictions = pipe(message)
                pred = int(predictions[0]['label'].replace("LABEL_", ""))
                analysis.append(category[pred])
            
            if analysis:
                sentiment = ",".join(analysis)
                cursor.execute("UPDATE SENTIMENTAL_TEST SET sentiment = %s WHERE seq = %s", (sentiment, item['seq']))
                conn.commit()

     
    except KeyboardInterrupt:
        cursor.close()
        conn.close() 
