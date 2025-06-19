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
gender = {'FEMALE': 0, 'MALE': 1, 'OTHER': 2}
SH = {'NO_INFO': 0, 'CURRENT': 1, 'EVER': 2, 'FORMER': 3, 'NEVER': 4, 'NOT_CURRENT': 5}
with pymysql.connect(host=host, port=port, user=user, passwd=passwd, db=database, charset='utf8') as db:
    cursor = db.cursor()
    cursor.execute("SELECT * FROM SURVEY_DIABETES WHERE trainDone IS NULL OR trainDone = 0")
    for row in cursor.fetchall():
        item = list(row[2:-4])
        item[0] = gender[item[0]]
        item[4] = SH[item[4]]

        items.append(item)


print(items)