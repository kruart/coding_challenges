from itertools import groupby

# https://www.hackerrank.com/challenges/compress-the-string/problem
if __name__ == '__main__':
    # to understand better: https://www.youtube.com/watch?v=jijYnDqhY9w
    print(*[(len(list(g)), int(k)) for k, g in groupby(input())])
