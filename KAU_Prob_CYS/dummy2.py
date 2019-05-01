import sys
import math
import numpy as np
import matplotlib.pyplot as plt

def random_variable(step):
    np.random.seed()
    arr = np.zeros((4,4))
    pX = [0.2, 0.4, 0.3, 0.1]
    pY = [0.25, 0.25, 0.25, 0.25]
    px = np.random.choice(4,step, pX)
    py = np.random.choice(4,step, pY)

    i=0
    while (i<step):
        arr[px[i], py[i]] += 1
        i += 1
        

    print(arr)
    
    px4=0
    py1=0
    pxy23=0
    
    for i in range(4):
        px4 += arr[3,i]/step

    for i in range(4):
        py1 += arr[i,0]/step

    for i in range(4):
        pxy23 += arr[i,2]
    pxy23 = arr[1,2]/ pxy23
    
    print("Px(4) = ", px4)
    print("Py(1) = ", py1)
    print("Pxy(2|3) = ",pxy23)
    
    EX1 = 0
    EY1 = 0
    
    for i in range(4):
        EX1 += (i+1) * pX[i]
        EY1 += (i+1) * pY[i]

    print("\nE[X] = ", EX1, "\nE[Y] = ", EY1)

    EX2 = np.mean([1,1,2,2,2,2,3,3,3,4])
    EY2 = np.mean([1,2,3,4])

    print("\nE[X]_truth = ", EX2, "\nE[Y]_truth = ", EY2)

    EX3 = 0
    EY3 = 0

    for i in range(4):
        EX3 += (i+1) * pow(pX[i],2)
        EY3 += (i+1) * pow(pY[i],2)

    varX = EX3 - pow(EX1,2)
    varY = EY3 - pow(EY1,2)

    print("\nV[X] = ", varX, "\nV[Y] = ", varY)

    print("\nE[2X+4] = ", (2 * EX1) + 4)
    print("E[-Y^2-1] = ",-EY3 -1)
    print("var[3Y-3] =", 9 * varY)

    pxy00 = arr[0,0] / step
    px0 = (arr[0,0] + arr[0,1] + arr[0,2] + arr[0,3]) / step
    py0 = (arr[0,0] + arr[1,0] + arr[2,0] + arr[3,0]) / step
    
    if (pxy00 == px0*py0):
        print("\nindependent")
    else:
        print("\ndependent")

    
    
    plt.figure(figsize=(4,4))
    for x in range (4):
        for y in range (4):
            plt.scatter(x+1, y+1, color='b')
            plt.text(x+1.1,y+1.1, "({}/{})".format(int(arr[x,y]),step), fontsize=7)
            
    plt.show()

    
random_variable(100)
