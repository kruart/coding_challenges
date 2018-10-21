import itertools

# https://www.hackerrank.com/challenges/itertools-combinations/problem
if __name__ == '__main__':
    s, k = input().split()
    for n in range(1, int(k)+1):
        combs = [''.join(c) for c in itertools.combinations(sorted(s), n)]
        print(*sorted(combs), sep="\n")
