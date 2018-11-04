# https://www.hackerrank.com/challenges/py-set-mutations/problem
def input_set():
    return set(input().split())


if __name__ == '__main__':
    _, s = input(), input_set()
    for _ in range(int(input())):
        eval('s.{}({})'.format(input().split()[0], input_set()))
    print(sum(map(int, s)))
