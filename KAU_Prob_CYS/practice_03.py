import sys
import numpy as np
import matplotlib.pyplot as plt
import os

def ncr(n,r):
    if r in (0,n):
        return 1
    return ncr(n-1,r) + ncr(n-1,r-1)

def binomial_dist(n, k, p):
        if k > n:
                print ('k can not be greater than n')
                sys.exit(1)
        else:
                q = 1-p
                dist = np.array([ncr(n,k)*(p**k)*(q**(n-k))])
                return dist
            
def yutNori(step, prob_head=0.5):
    ar = np.random.binomial(4, .5 , step)
    mo = sum(ar==0)/step
    do = sum(ar==1)/step
    gae = sum(ar==2)/step
    geol = sum(ar==3)/step
    yut = sum(ar==4)/step
    
    mo_truth = binomial_dist (4, 0, .5)    
    do_truth = binomial_dist(4, 1, .5)
    gae_truth = binomial_dist(4, 2, .5)
    geol_truth = binomial_dist(4, 3, .5)
    yut_truth = binomial_dist(4, 4, .5)
        
    sum_of_probability = mo + do + gae + geol + yut
    
    if sum_of_probability != 1: 
        print ('Sum of probability is not one')
        sys.exit(1)
    print ('Probability mo: %f, %f' %(mo, mo_truth) + \
        '\nProbability do: %f, %f' %(do, do_truth) + \
        '\nProbability gae: %f, %f' %(gae, gae_truth) + \
        '\nProbability geol: %f, %f' %(geol, geol_truth) + \
        '\nProbability yut: %f, %f' %(yut, yut_truth))
    
    fig = plt.figure()
    
    ax1 = fig.add_subplot(121)
    ax2 = fig.add_subplot(122)
    
    ax1.bar(["mo","do","gae","geol","yut"],[mo,do,gae,geol,yut])
    ax1.set_title("experiment")
    ax2.bar(["mo","do","gae","geol","yut"],[np.float(mo_truth),np.float(do_truth),np.float(gae_truth),np.float(geol_truth),np.float(yut_truth)])
    ax2.set_title("truth")
    
    plt.show()

def main():

    if len(sys.argv) != 2:
        print ('usage: ./yut.py step')
        sys.exit(1)
    
    step = int(sys.argv[1])

    yutNori(step=step)


if __name__ == '__main__':
  main()




