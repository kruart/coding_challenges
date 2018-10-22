# https://www.hackerrank.com/challenges/py-set-difference-operation/problem
if __name__ == '__main__':
    _, s1 = input(), set(map(int, input().split()))
    _, s2 = input(), set(map(int, input().split()))

    print(len(s1.difference(s2)))