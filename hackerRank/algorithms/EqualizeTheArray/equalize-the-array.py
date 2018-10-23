from collections import Counter

# https://www.hackerrank.com/challenges/equality-in-a-array/problem
def equalizeArray(arr):
    return len(arr) - max(Counter(arr).values())


if __name__ == '__main__':
    print(equalizeArray([3, 3, 2, 1, 3]))   # 2
