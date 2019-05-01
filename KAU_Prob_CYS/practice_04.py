import sys
import math
import numpy as np
import matplotlib.pyplot as plt

def geometric_experiment(head_prob, step):
    # TODO [1]: 확률이 head_prob인 geometric 분포 결과를
    #           시행 횟수를 step만큼 진행하여 변수 random_var_head에 추출하시오.
    random_var_head = np.random.geometric(p=head_prob, size=step)
    max_num = np.max(random_var_head)
   
    exp_x = 0
    exp_x2 = 0
    x_bin = []
    y_bin = []
    
    for i in range(1, max_num+1):
        x_bin.append(sum(random_var_head==i))

    for i in range(1, len(x_bin)):
        exp_x += i*(x_bin[i-1])/step
        exp_x2 += math.pow(i,2)*(x_bin[i-1])/step
        # TODO [2]: head가 나올 때까지의 횟수가 각각 얼마나 나왔는지 x_bin에 기록하시오.
        #           예) 1회만에 head가 나온 횟수: 3
        #               2회만에 head가 나온 횟수: 12
        #               ...
        # TODO [3]: 실험값 x의 기댓값(exp_x)과 x^2의 기댓값(exp_x2)을 누적하시오.

    # TODO [4]: 실험값과 이론값의 평균과 분산을 출력하시오.
    exp_mean = exp_x
    exp_var = exp_x2 - math.pow(exp_mean,2)

    geo_mean = 0
    geo_var = 0
    
    for i in range(1, step):
        y_bin.append(step * math.pow(head_prob,1) * math.pow(1-head_prob,i-1))

    for i in range(1, len(y_bin)):
        geo_mean += i * math.pow(head_prob,1) * math.pow(1-head_prob,i-1)
        geo_var += (i**2) * math.pow(head_prob,1) * math.pow(1-head_prob,i-1)

    geo_var = geo_var - math.pow(geo_mean,2)

    print('          Experiment   Geometric')
    print('Mean:     %.4f,      %.4f'     %(exp_mean, geo_mean))
    print('Variance: %.4f,      %.4f'     %(exp_var, geo_var))


    # TODO [5]: 실험값(Experiment)와 이론값(Geometric)을 범례와 함께 bar plot으로 나타내시오.

    #           단, x축의 범위는 1부터 실험값의 최댓값이 되도록 하시오.
    
    X = np.arange(len(x_bin))
    Y = np.arange(len(y_bin))
    
    plt.bar(X + 0.8, x_bin, label='exp', color='b', width = 0.4)
    plt.bar(Y + 1.2, y_bin, label='geo', color='g', width = 0.4)
    plt.xlim(0,len(x_bin)+1)
    plt.legend()
    plt.title('geo_graph')
    plt.show()

def main():
    if len(sys.argv) != 3:
        print('usage: ./geo.py head_prob step')
        sys.exit(1)

    head_prob = float(sys.argv[1])
    step = int(sys.argv[2])

    geometric_experiment(head_prob=head_prob, step=step)

if __name__ == '__main__':
    main()

