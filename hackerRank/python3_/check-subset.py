# https://www.hackerrank.com/challenges/py-check-subset/problem
if __name__ == '__main__':
    for _ in range(int(input())):
        _, s1 = input(), set(input().split())
        _, s2 = input(), set(input().split())
        print(s1 <= s2)
