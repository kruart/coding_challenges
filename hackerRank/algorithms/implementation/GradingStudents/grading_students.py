# www.hackerrank.com/challenges/grading/problem
def grading_students(grades):
    return [(i - (i % 5) + 5) if i >= 38 and i % 5 > 2 else i for i in grades]


if __name__ == '__main__':
    print(grading_students([73, 67, 38, 33]))
