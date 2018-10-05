# https://www.hackerrank.com/challenges/py-set-intersection-operation/problem
if __name__ == '__main__':
    _, s1 = input(), {*input().split()}
    _, s2 = input(), {*input().split()}
    print(len(s1.intersection(s2)))
