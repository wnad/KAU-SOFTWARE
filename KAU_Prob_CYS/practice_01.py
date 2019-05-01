# -*- coding: utf-8 -*-

import numpy as np

# 1. 0부터 9까지의 숫자로 이루어진 1차원 배열을 만드시오.
# 출력: array([0,1,2,3,4,5,6,7,8,9])

x1 = np.array([0,1,2,3,4,5,6,7,8,9])
print(x1)
print("\n")

# 2. 위에서 만든 1차원 배열을 2차원으로 만드시오.
# 출력: array([[0,1,2,3,4],[5,6,7,8,9])

x2 = x1.reshape(2,int(len(x1) / 2))
print(x2)
print("\n")

# 3. 위에서 만든 2차원 배열에서 홀수인 원소만 추출하시오.
# 출력: array([1,3,5,7,9])

x3 = np.array(x2[x2%2==1])

print(x3)
print("\n")

# 4. 2번에서 만든 2차원 배열에서 값이 (1) 3,8인 원소와 (2) 6,7인 원소를 추출하시오.
# 출력: array([3,8]) array([6,7])

x4 = np.array(x2[:, 3])
x5 = np.array(x2[1, 1:3])

print(x4)
print(x5)
print("\n")

# 5. 2번에서 만든 2차원 배열의 (1) 각 행을 더하시오. (2) 각 열을 더하시오.
# 출력: array([5,6,9,11,13]) array([10, 35])

print(np.sum(x2, axis=1))
print(np.sum(x2, axis=0))

# 6. 2번에서 만든 2차원 배열의 각 행을 따로 저장하시오. (이하 a, b)
# a와 b를 더하시오. a를 transpose하여 b와 dot-product 하시오.
# 출력: array([0,1,2,3,4]), array([5,6,7,8,9]) array([5,7,9,11,13]) array([80])

a = np.array(x2[0])
b = np.array(x2[1])
print(np.dot(a, b))

