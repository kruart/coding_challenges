# https://www.hackerrank.com/challenges/staircase/problem
def staircase(n):
    for row in range(1, n+1):
        print(('#'*row).rjust(n))


if __name__ == '__main__':
    staircase(6)
    staircase(15)