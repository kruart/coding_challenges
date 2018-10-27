# https://www.hackerrank.com/challenges/cut-the-sticks/problem
def cutTheSticks(arr):
    arr.sort()
    sticks = [len(arr)]

    for i in range(1, len(arr)):
        if arr[i] != arr[i-1]:
            sticks.append((len(arr) - i))
    return sticks


if __name__ == '__main__':
    print(*cutTheSticks([1, 2, 3]))                 # 3 2 1
    print(*cutTheSticks([5, 4, 4, 2, 2, 8]))        # 6 4 2 1
    print(*cutTheSticks([1, 2, 3, 4, 3, 3, 2, 1]))  # 8 6 4 1
