# https://www.hackerrank.com/challenges/funny-string/problem
def funnyString(s):
    return all(abs(ord(s[i]) - ord(s[i-1])) == abs(ord(s[len(s)-i]) - ord(s[len(s)-i-1])) for i in range(1, len(s)))


if __name__ == '__main__':
    n = int(input())
    for _ in range(n):
        print('Funny' if funnyString(input()) else 'Not Funny')