import numpy as np

# 1. 0부터 9까지의 숫자로 이루어진 1차원 배열을 만드시오.
arr_1D = np.arange(10)

# 2. 위에서 만든 1차원 배열을 2차원으로 만드시오.
arr_2D = arr_1D.reshape(2, 5)

# 3. 위에서 만든 2차원 배열에서 홀수인 원소만 추출하시오.
arr_odd = arr_2D[arr_2D % 2 == 1]

# 4. 2번에서 만든 2차원 배열에서 값이 (1) 3,8인 원소와 (2) 6,7인 원소를 추출하시오.
arr_38 = arr_2D[:, 3]	# (1)
arr_67 = arr_2D[1, 1:3]	# (2)

# 5. 2번에서 만든 2차원 배열의 (1) 각 행을 더하시오. (2) 각 열을 더하시오.
arr_col_sum = np.sum(arr_2D, axis=0)	# (1)
arr_row_sum = np.sum(arr_2D, axis=1)	# (2)

# 6. 2번에서 만든 2차원 배열의 각 행을 따로 저장하시오. (이하 a, b)
#    a와 b를 더하시오.
#    a를 transpose하여 b와 dot-product 하시오.
a, b = arr_2D[0], arr_2D[1]
arr_add_ab = np.add(a, b)
arr_dot_ab = np.dot(np.transpose(a), b)