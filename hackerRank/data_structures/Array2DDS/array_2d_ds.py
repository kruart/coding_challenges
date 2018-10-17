# https://www.hackerrank.com/challenges/2d-array/problem
def hourglassSum(arr):
    max_sum = -63   # arr[i][j] >= -9 ... (-9) * 7

    for i in range(0, len(arr)-2):
        for j in range(0, len(arr)-2):
            temp_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
            if max_sum < temp_sum:
                max_sum = temp_sum
    return max_sum


arr = [
    [1, 1, 1, 0, 0, 0],
    [0, 1, 0, 0, 0, 0],
    [1, 1, 1, 0, 0, 0],
    [0, 0, 2, 4, 4, 0],
    [0, 0, 0, 2, 0, 0],
    [0, 0, 1, 2, 4, 0]]

arr1 = [
    [1, 1, 1, 0, 0, 0],
    [0, 1, 0, 0, 0, 0],
    [1, 1, 1, 0, 0, 0],
    [0, 9, 2, -4, -4, 0],
    [0, 0, 0, -2, 0, 0],
    [0, 0, -1, -2, -4, 0]]

arr2 = [
    [1, 1, 1, 0, 0, 7],
    [0, 1, 0, 0, 5, 0],
    [1, 1, 1, 0, 8, 0],
    [0, 9, 2, 9, 4, 0],
    [0, 0, 0, -2, 8, 0],
    [0, 0, -1, 2, 7, 7]]

arr3 = [
    [0, -4, -6, 0, -7, -6],
    [-1, -2, -6, -8, -3, -1],
    [-8, -4, -2, -8, -8, -6],
    [-3, -1, -2, -5, -7, -4],
    [-3, -5, -3, -6, -6, -6],
    [-3, -6, 0, -8, -6, -7]]

print(hourglassSum(arr))    # 19
print(hourglassSum(arr1))   # 13
print(hourglassSum(arr2))   # 37
print(hourglassSum(arr3))   # -19
