# https://www.hackerrank.com/challenges/angry-professor/problem
def angryProfessor(k, a):
    count = len(list(filter(lambda i: i <= 0, a)))
    return "YES" if k > count else "NO"


print(angryProfessor(3, [-1, -3, 4, 2]))  # YES
print(angryProfessor(2, [0, -1, 2, 1]))   # NO
