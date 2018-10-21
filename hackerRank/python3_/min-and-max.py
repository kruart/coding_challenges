import numpy

# https://www.hackerrank.com/challenges/np-min-and-max/problem
if __name__ == '__main__':
    n, m = input().split()
    l = []
    for i in range(0, int(n)):
        l.append(list(map(int, input().split())))

    print(numpy.max(numpy.min(l, 1)))
