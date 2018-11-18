import numpy


# https://www.hackerrank.com/challenges/np-arrays/problem
def arrays(arr):
    return numpy.array(arr, float)[::-1]


if __name__ == '__main__':
    arr = input().split()
    print(arrays(arr))
