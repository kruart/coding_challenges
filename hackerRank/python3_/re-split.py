import re

# https://www.hackerrank.com/challenges/re-split/problem
if __name__ == '__main__':
    print(*re.split(r'[,.]', input()), sep='\n')
