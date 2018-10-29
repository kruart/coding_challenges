from collections import namedtuple

# https://www.hackerrank.com/challenges/py-collections-namedtuple/problem
if __name__ == '__main__':
    (n, Student) = (int(input()), namedtuple('Student', input()))

    students = [Student(*input().split()) for i in range(0, n)]
    print((sum(int(s.MARKS) for s in students)) / len(students))