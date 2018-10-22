from collections import deque

# https://www.hackerrank.com/challenges/py-collections-deque/problem
if __name__ == '__main__':
    n = int(input())
    q = deque()

    for i in range(0, n):
        eval('q.{}({})'.format(*input().split(), ''))

    print(*q)
