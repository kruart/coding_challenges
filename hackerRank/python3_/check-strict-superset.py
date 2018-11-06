# https://www.hackerrank.com/challenges/py-check-strict-superset/problem
if __name__ == '__main__':
    a = set(input().split())

    is_super_set = all(a > set(input().split()) for _ in range(int(input())))
    print(is_super_set)
