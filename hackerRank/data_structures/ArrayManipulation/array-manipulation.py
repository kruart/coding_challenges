# https://www.hackerrank.com/challenges/crush/problem
def arrayManipulation(n, queries):
    arr = [0] * (n+2)
    max_num = float('-inf')
    sum_num = 0

    for q in queries:
        arr[q[0]] += q[2]
        arr[q[1]+1] -= q[2]

    for item in arr:
        sum_num += item
        max_num = max(max_num, sum_num)

    return max_num


if __name__ == '__main__':
    n, m = map(int, input().split())
    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)
    print(result)
