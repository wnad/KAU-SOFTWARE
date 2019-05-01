import sys
import numpy as np
import matplotlib.pyplot as plt
import math

def ncr(n,r):
    if r in (0,n):
        return 1
    return ncr(n-1,r) + ncr(n-1,r-1)

def bidist(n,p):
    q = 1-p
    dist = np.array([ ncr(n, k)*(p**k)*(q**(n-k)) for k in range(n+1)])
    return dist

def show_plot(n=5, p=.5):
    plt.plot(bidist(n,p))
    m, s = n*p, math.sqrt(n*p*(1-p))
    plt.axvline(x=m, color='r', alpha=.6)
    plt.axvline(x=(m-s), color='grey', alpha=.6)
    plt.axvline(x=(m+s), color='grey', alpha=.6)
    plt.title('Binomial Distribution $ B(%d, %lf) $'%(n, p))
    plt.show()

if __name__ == '__main__':
    if len(sys.argv) == 3:
        n, p = int(sys.argv[1]), float(sys.argv[2])
        if n > 1 and 0 < p < 1:
            show_plot(n, p)
            sys.exit()
    show_plot()
