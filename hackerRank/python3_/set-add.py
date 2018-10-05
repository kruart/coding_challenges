# https://www.hackerrank.com/challenges/py-set-add/problem
if __name__ == '__main__':
    n = int(input())

    coinSet = {input() for i in range(n)}
    print(len(coinSet))
