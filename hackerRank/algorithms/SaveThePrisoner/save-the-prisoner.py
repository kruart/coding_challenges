# https://www.hackerrank.com/challenges/save-the-prisoner/problem
def saveThePrisoner(n, m, s):
    k = (m - 1 + s) % n
    return n if k == 0 else k


if __name__ == '__main__':
    print(saveThePrisoner(4, 6, 2))   # 3
    print(saveThePrisoner(5, 2, 1))   # 2
    print(saveThePrisoner(5, 2, 2))   # 3
    print(saveThePrisoner(7, 19, 2))  # 6
    print(saveThePrisoner(3, 7, 3))   # 3
    print(saveThePrisoner(5, 5, 1))   # 5
    print(saveThePrisoner(352926151, 380324688, 94730870))    # 122129406
    print(saveThePrisoner(94431605, 679262176, 5284458))      # 23525398
    print(saveThePrisoner(785405778, 835771758, 689182705))   # 739548684
    print(saveThePrisoner(999999999, 999999999, 1))           # 999999999
    print(saveThePrisoner(877625009, 999275937, 874127074))   # 118152992
