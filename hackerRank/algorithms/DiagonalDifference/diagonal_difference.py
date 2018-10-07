def diagonal_difference(arr):
    return abs(sum([arr[i][i] - arr[i][len(arr)-i-1] for i in range(len(arr))]))


def main():
    matrix1 = [
        [1, 2, 3],
        [4, 5, 6],
        [9, 8, 9]
    ]
    matrix2 = [
        [11, 2, 4],
        [4, 5, 6],
        [10, 8, -12]
    ]
    print(diagonal_difference(matrix1))  # 15 - 17 = 2
    print(diagonal_difference(matrix2))  # 4 - 19 = 15


if __name__ == '__main__':
    main()
