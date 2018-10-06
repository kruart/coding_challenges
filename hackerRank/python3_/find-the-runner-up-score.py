# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem
def get_runner_up(l: list):
    max_score = max(l)
    return max(list(filter(lambda i: i != max_score, l)))


if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    print(get_runner_up(list(arr)))