import numpy

# https://www.hackerrank.com/challenges/np-sum-and-prod/problem
def read_arr():
    return list(map(int, input().split()))

if __name__ == '__main__':
    n, _ = map(int, input().split())
    arr = numpy.array([read_arr() for _ in range(n)])
    print(numpy.prod(numpy.sum(arr, axis=0), axis=0))
