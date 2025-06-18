import os
import sys
import json
import pickle
import numpy as np
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier

# 입력 데이터 처리 
#data = '[[1.0, 46.0, 0.0, 0.0, 3.0, 29.6, 5.8, 130.0], [1.0, 69.0, 1.0, 0.0, 4.0, 29.52, 3.5, 140.0], [0.0, 50.0, 0.0, 0.0, 0.0, 27.32, 5.7, 140.0], [0.0, 74.0, 0.0, 0.0, 3.0, 25.53, 4.5, 159.0], [0.0, 80.0, 1.0, 0.0, 4.0, 21.17, 6.6, 145.0]]'
if len(sys.argv) < 2:
    sys.exit(-1)

data = np.array(json.loads(sys.argv[1]))

# 기준 경로 
base_path = os.path.dirname(os.path.realpath(__file__)) + "/"

# 모델과 Scaler 불러오기 
with open(base_path + "model.pkl", "rb") as f:
    model = pickle.load(f)

with open(base_path + "scaler.pkl", "rb") as f:
    scaler = pickle.load(f)


# 모델 예측 
data_scaled = scaler.transform(data)
predictions = model.predict(data_scaled)
print(json.dumps(predictions.tolist()))