# https://www.hackerrank.com/challenges/collections-counter/problem
from collections import Counter

if __name__ == '__main__':
    _ = input()
    c = Counter(list(map(int, input().split())))
    totalSum = 0

    for i in range(0, int(input())):
        l = list(map(int, input().split()))
        if c[l[0]] > 0:
            totalSum += l[1]
            c[l[0]] -= 1

    print(totalSum)