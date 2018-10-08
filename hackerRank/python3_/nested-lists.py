# https://www.hackerrank.com/challenges/nested-list/problem
if __name__ == '__main__':
    pairs = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        pairs.append([name, score])

    second_lowest = sorted(set([p[1] for p in pairs]))[1]
    [print(p[0]) for p in sorted(pairs, key=lambda e: e[0]) if p[1] == second_lowest]

