# https://www.hackerrank.com/challenges/python-string-formatting/problem
def print_formatted(num):
    maxWidth = len(format(num, 'b'))
    for i in range(1, num+1):
        print("{0:>{width}} {0:>{width}o} {0:>{width}X} {0:>{width}b}".format(i, width=maxWidth))


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
