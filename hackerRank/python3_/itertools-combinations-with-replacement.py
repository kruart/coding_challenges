import itertools

# https://www.hackerrank.com/challenges/itertools-combinations-with-replacement/problem
if __name__ == '__main__':
    args = input().split()
    [print("".join(t)) for t in itertools.combinations_with_replacement(sorted(args[0]), int(args[1]))]
