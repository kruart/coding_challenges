# https://www.hackerrank.com/challenges/np-concatenate/problem
import numpy

if __name__ == '__main__':
    n, m, _ = map(int, input().split())

    # way 1
    # arr = [list(map(int, input().split())) for _ in range(n)]
    # arr2 = [list(map(int, input().split())) for _ in range(m)]
    # print(numpy.concatenate((arr, arr2)))

    # way 2
    arr = numpy.array([list(map(int, input().split())) for _ in range(n+m)])
    print(arr)


