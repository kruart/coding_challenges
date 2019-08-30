package uniquePaths2;

// https://leetcode.com/problems/unique-paths-ii/
public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int N = obstacleGrid.length;
        int M = obstacleGrid[0].length;
        if (obstacleGrid[N-1][M-1] == 1) return 0;

        int[][] paths = new int[N][M];

        for (int i = 0; i < N; i++) {
            if (obstacleGrid[i][0] == 1) break;
            paths[i][0] = 1;
        }

        for (int i = 0; i < M; i++) {
            if (obstacleGrid[0][i] == 1) break;
            paths[0][i] = 1;
        }

        for (int row = 1; row < N; row++) {
            for (int col = 1; col < M; col++) {
                if (obstacleGrid[row][col] == 0) {
                    paths[row][col] = paths[row-1][col] + paths[row][col-1];
                }
            }
        }
        return paths[N-1][M-1];
    }
}
