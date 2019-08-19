# https://leetcode.com/problems/unique-paths-ii/submissions/
class UniquePaths2:
    def uniquePathsWithObstacles(self, obstacleGrid) -> int:
        N = len(obstacleGrid)
        M = len(obstacleGrid[0])
        matrix = [[0]*M for _ in range(N)]

        for row in range(N):
            if obstacleGrid[row][0] == 0:
                matrix[row][0] = 1
            else:
                matrix[row][0] = 0
                break

        for col in range(M):
            if obstacleGrid[0][col] == 0:
                matrix[0][col] = 1
            else:
                matrix[0][col] = 0
                break

        for row in range(1, N):
            for col in range(1, M):
                if obstacleGrid[row][col] == 0:
                    matrix[row][col] = matrix[row][col-1] + matrix[row-1][col]

        return matrix[N-1][M-1]