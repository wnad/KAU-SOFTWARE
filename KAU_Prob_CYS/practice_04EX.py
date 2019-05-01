import sys
import math
import numpy as np
import matplotlib.pyplot as plt

def geom_randVar(step, prob):
    ran = np.random.rand(step)
    for i in range(1, step):
        if ran[i] < prob:
            ran[i] = 0
        else:
            ran[i] = 1
    return ran
    """
    step: 실험 횟수
    prob: 0이 될 확률

    # TODO
    numpy.random.geometric을 구현해본다.
    실험 내용: numpy.random.random()으로 난수를 생성하여 그 값이 prob 보다 클 때까지 반복한다.
              그리고 그 반복 횟수를 매 실험의 결과값으로 리스트에 저장한다.
              해당 실험을 step 만큼 반복한다.
    geom_randVar 함수의 반환값은 실험 결과 (step만큼의 길이를 가진 리스트)
    """

def geom_dist(step, prob):
    random_var_head = []
    for j in range(1, step+1):
        exp = geom_randVar(step, 1- prob)
        for i in range(1, step+1):
            if exp[i] ==1:
                random_var_head.append(i)
                break

    max_num = np.max(random_var_head)
    exp_x = 0
    exp_x2 = 0
    x_bin = []
    y_bin = []

    list1 = np.array(random_var_head)
    
    for i in range(1, max_num+1):
        x_bin.append(sum(list1==i))
    
    for i in range(1, len(x_bin)):
        exp_x += i*(x_bin[i-1])/step
        exp_x2 += math.pow(i,2)*(x_bin[i-1])/step

    exp_mean = exp_x
    exp_var = exp_x2 - math.pow(exp_mean,2)

    geo_mean = 0
    geo_var = 0

    for i in range(1, step):
        y_bin.append(step * math.pow(prob,1) * math.pow(1-prob,i-1))

    for i in range(1, len(y_bin)):
        geo_mean += i * math.pow(prob,1) * math.pow(1-prob,i-1)
        geo_var += (i**2) * math.pow(prob,1) * math.pow(1-prob,i-1)

    geo_var = geo_var - math.pow(geo_mean,2)

    print('          Experiment   Geometric')
    print('Mean:     %.4f,      %.4f'     %(exp_mean, geo_mean))
    print('Variance: %.4f,      %.4f'     %(exp_var, geo_var))

    X = np.arange(len(x_bin))
    Y = np.arange(len(y_bin))


    plt.bar(X + 0.8, x_bin, label='exp', color='b', width = 0.3)
    plt.bar(Y + 1.2, y_bin, label='geo', color='g', width = 0.3)
    plt.xlim(0,len(x_bin)+1)
    plt.legend()
    plt.title('geo_graph')
    plt.show()
    
  # LMS에 parctice_04.py 참조

def main():
  if len(sys.argv) != 3:
    print ('usage: python practice_04.py step prob')
    sys.exit(1)

  step = int(sys.argv[1])
  prob = float(sys.argv[2])

  geom_dist(step=step, prob=prob)

if __name__ == '__main__':
    main()

