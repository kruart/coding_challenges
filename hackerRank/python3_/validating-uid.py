# https://www.hackerrank.com/challenges/validating-uid/problem
import re


def validating_uid(uid: str) -> str:
    regEx = [r'(\w*[A-Z]){2}', r'(\w*[0-9]){3}']
    if len(set(uid)) == 10 and uid.isalnum() and all(re.match(exp, uid) for exp in regEx):
        return "Valid"
    else:
        return "Invalid"


if __name__ == '__main__':
    for _ in range(int(input())):
        print(validating_uid(input()))
