# https://leetcode.com/problems/unique-paths/
class UniquePaths:
    def uniquePaths(self, m: int, n: int) -> int:
        matrix = [[1] * m]

        for i in range(1, n):
            matrix.append([1] + [0] * (m-1))

        for row in range(1, n):
            for col in range(1, m):
                matrix[row][col] = matrix[row][col-1] + matrix[row-1][col]

        return matrix[n-1][m-1]
