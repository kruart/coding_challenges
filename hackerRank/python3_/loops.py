# https://www.hackerrank.com/challenges/python-loops/problem
if __name__ == '__main__':
    n = int(input())

    # use comprehension list
    [print(i*i) for i in range(n) if n > 0]

    # standard way
    # for i in range(n):
    #     if n > 0:
    #         print(i*i)
