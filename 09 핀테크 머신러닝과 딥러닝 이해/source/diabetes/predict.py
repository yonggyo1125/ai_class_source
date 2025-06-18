import os
import json
import pickle
import numpy as np
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier


# 기준 경로 
base_path = os.path.dirname(os.path.realpath(__file__)) + "/"

# 모델과 Scaler 불러오기 
with open(base_path + "model.pkl", "rb") as f:
    model = pickle.load(f)

with open(base_path + "scaler.pkl", "rb") as f:
    scaler = pickle.load(f)


# 모델 예측 
