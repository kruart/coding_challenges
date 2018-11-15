# https://www.hackerrank.com/challenges/zipped/problem
if __name__ == '__main__':
    _, x = map(int, input().split())
    scores = [list(map(float, input().split())) for _ in range(x)]  # get 'x' list of scores
    print(*[sum(s) / x for s in zip(*scores)], sep="\n")   # zip scores, get sums and then get average
