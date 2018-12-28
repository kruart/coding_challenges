import datetime


# https://www.hackerrank.com/challenges/python-time-delta/problem
def time_delta(t1, t2, fmt='%a %d %b %Y %H:%M:%S %z'):
    d1 = datetime.datetime.strptime(t1, fmt)
    d2 = datetime.datetime.strptime(t2, fmt)
    return int(abs((d1-d2).total_seconds()))


if __name__ == '__main__':
    for _ in range(int(input())):
        print(time_delta(input(), input()))
