import re


# https://www.hackerrank.com/challenges/introduction-to-regex/problem
def is_float(value):
    return re.match('^[-+]?\d*\.\d+$', value) is not None


if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        print(is_float(input()))
