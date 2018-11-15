# https://www.hackerrank.com/challenges/python-sort-sort/problem
if __name__ == '__main__':
    n, _ = map(int, input().split())
    lines = [input() for _ in range(n)]
    k = int(input())

    # using sorted method
    print(*sorted(lines, key=lambda l: int(l.split()[k])), sep="\n")

    # using sort method
    # lines.sort(key=lambda l: int(l.split()[k]))
    # print(*lines, sep="\n")
