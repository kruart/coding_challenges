# https://www.hackerrank.com/challenges/itertools-product/problem
from itertools import product

if __name__ == '__main__':
    a = map(int, input().split())
    b = map(int, input().split())

    print(*list(product(a, b)))