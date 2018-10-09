# https://www.hackerrank.com/challenges/designer-door-mat/problem
def print_designer_mat(n, m):
    str = ".|."
    for i in range(1, int(n/2)+1):
        print((str*(i*2-1)).center(m, '-'))

    print("WELCOME".center(m, '-'))

    for i in range(n//2, 0, -1):
        print((str*(i*2-1)).center(m, '-'))


if __name__ == '__main__':
    nm = input().split()
    n = int(nm[0])
    m = int(nm[1])
    print_designer_mat(n, m)
