# https://www.hackerrank.com/challenges/defaultdict-tutorial/problem
from collections import defaultdict

if __name__ == '__main__':
    n, m = map(int, input().split())
    d = defaultdict(list)

    for i in range(1, n+1):
        d[input()].append(i)

    for i in range(0, m):
        print(" ".join(map(str, d[input()])) or -1)
