# https://www.hackerrank.com/challenges/strong-password/problem
import re

def minimumNumber(n, password):
    c = len([p for p in ['[a-z]', '[A-Z]', '[0-9]', '\\W'] if not re.search(p, password)])
    return max(c, 6 - n)


if __name__ == '__main__':
    n, password = int(input()), input()
    # print(minimumNumber(n, password))
    print(minimumNumber(n, password))
