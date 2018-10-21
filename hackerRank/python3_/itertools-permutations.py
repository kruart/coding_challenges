import itertools

# https://www.hackerrank.com/challenges/itertools-permutations/problem
if __name__ == '__main__':
    arr = input().split()
    [print(''.join(p), sep="\n") for p in sorted(itertools.permutations(arr[0], int(arr[1])))]
