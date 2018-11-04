import re

# https://www.hackerrank.com/challenges/incorrect-regex/problem
if __name__ == '__main__':
    for _ in range(int(input())):   # n times
        try:
            re.compile(input())
            print(True)
        except re.error:
            print(False)

