# https://www.hackerrank.com/challenges/fibonacci-modified/problem
def fibonacciModified(t1, t2, n):
    ts = [t1, t2]
    for i in range(2, n):
        ts.append(ts[i-2] + ts[i-1]**2)
    return ts[-1]


if __name__ == '__main__':
    t1, t2, n = map(int, input().split())
    print(fibonacciModified(t1, t2, n))
