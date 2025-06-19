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
port = sys.argv[2]
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