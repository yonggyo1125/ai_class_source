import pickle
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split, GridSearchCV
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier

df = pd.read_csv("diabetes_prediction_dataset.csv")

# 데이터 전처리 
# gender : Female - 0, Male - 1, Other - 2
df = df.replace(to_replace={'gender':{'Female': 0, 'Male': 1, 'Other': 2}})
#np.unique(df['smoking_history'].to_numpy())
"""
No Info - 0
current - 1
ever - 2
former - 3
never - 4 
not current - 5
"""
df = df.replace(to_replace={'smoking_history': {'No Info': 0, 'current': 1, 'ever': 2, 'former': 3, 'never': 4, 'not current': 5}})


# 훈련 데이터와 정답(타겟) 데이터 분리 
diabetes_target = df['diabetes'].to_numpy()
diabetes_data = df.drop('diabetes', axis=1).to_numpy()

# 훈련세트, 테스트 세트 분리 
train_input, test_input, train_target, test_target = train_test_split(
    diabetes_data, diabetes_target, test_size=0.1
)

# 데이터 정규화 - 표준점수
ss = StandardScaler()
ss.fit(train_input)  # 표준 점수의 기준은 무조건 훈련세트 

train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)

# SGDClassifier 가장 좋은 모델 생성
params = {'max_iter': np.arange(90,120)}
gs = GridSearchCV(SGDClassifier(loss='log_loss', n_jobs=-1, tol=None), params, n_jobs=-1)
gs.fit(train_scaled, train_target)

model = gs.best_estimator_

# 학습한 모델 저장
with open("model.pkl", "wb") as f:
    pickle.dump(model, f)

# 표준점수 Scaler 저장 
with open("scaler.pkl", "wb") as f:
    pickle.dump(ss, f)