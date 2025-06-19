import os
import sys
import pymysql
import pickle
import numpy as np
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier

# DB 연결 계정 
if len(sys.argv) < 6:
    sys.exit(-1)

host = sys.argv[1]
port = int(sys.argv[2])
user = sys.argv[3]
passwd = sys.argv[4]
database = sys.argv[5]

# 기준 경로 
base_path = os.path.dirname(os.path.realpath(__file__)) + "/"

# 모델과 Scaler 불러오기 
with open(base_path + "model.pkl", "rb") as f:
    model = pickle.load(f)

with open(base_path + "scaler.pkl", "rb") as f:
    scaler = pickle.load(f)

# DB 연결 및 추가학습할 데이터 조회
items = []
targets = []
gender = {'FEMALE': 0, 'MALE': 1, 'OTHER': 2}
SH = {'NO_INFO': 0, 'CURRENT': 1, 'EVER': 2, 'FORMER': 3, 'NEVER': 4, 'NOT_CURRENT': 5}
with pymysql.connect(host=host, port=port, user=user, passwd=passwd, db=database, charset='utf8') as db:
    cursor = db.cursor()
    cursor.execute("SELECT gender, age, hypertension, heartDisease, smokingHistory, bmi, hbA1c, bloodGlucoseLevel, diabetes FROM SURVEY_DIABETES WHERE trainDone IS NULL OR trainDone = 0")
    rows = cursor.fetchall()
    if len(rows) == 0:
        print("학습할 데이터가 없습니다.")
        sys.exit()

    for row in rows:
        item = list(row)
        item[0] = gender[item[0]]
        item[4] = SH[item[4]]

        items.append(item[:-1])
        targets.append(item[-1])


# 훈련데이터, 타겟 데이터를 분리
train_input = np.array(items)
train_target = np.array(targets)

# 훈련데이터를 표준 점수로 정규화
train_scaled = scaler.transform(train_input)

# 부분학습 진행 
model.partial_fit(train_scaled, train_target);

# 정확도(R^2) 검증
print("정확도:", model.score(train_scaled, train_target)) 

# 모델 저장 
with open(base_path + "model.pkl", "wb") as f:
    pickle.dump(model, f)

# 학습 완료 DB 업데이트
with pymysql.connect(host=host, port=port, user=user, passwd=passwd, db=database, charset='utf8') as db:
    cursor = db.cursor()
    cursor.execute("UPDATE SURVEY_DIABETES SET trainDone=1 WHERE trainDone IS NULL OR trainDone=0")
    db.commit()

print("부분학습 완료!")