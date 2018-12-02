from collections import Counter

# https://www.hackerrank.com/challenges/py-the-captains-room/problem
if __name__ == '__main__':
    _, guests = input(), input().split()
    c = Counter(guests)

    for k, v in c.items():
        if v == 1:
            print(k)
            break
