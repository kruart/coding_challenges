package minimumPathSum;

// https://leetcode.com/problems/minimum-path-sum/
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;

        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < N; i++) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }

        for (int i = 1; i < M; i++) {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                int val = grid[i][j];
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + val;
            }
        }
        return dp[N-1][M-1];
    }
}
