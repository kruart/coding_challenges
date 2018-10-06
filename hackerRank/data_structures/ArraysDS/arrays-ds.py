# https://www.hackerrank.com/challenges/arrays-ds/problem
def reverseArray(a: list):
    return a[::-1]


if __name__ == '__main__':
    print(reverseArray([1, 4, 5, 3, 2]))  # 2, 3, 5, 4, 1
    print(reverseArray([1, 4, 3, 2]))     # 2, 3, 4, 1
