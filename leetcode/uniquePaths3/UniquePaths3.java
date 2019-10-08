package uniquePaths3;

// https://leetcode.com/problems/unique-paths-iii/
public class UniquePaths3 {
    public int uniquePathsIII(int[][] grid) {
        int countObstacles = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == -1) {
                    countObstacles++;
                }
                if (grid[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        return dfs(grid, row, col, grid.length * grid[0].length - countObstacles, 0);
    }

    private int dfs(int[][] grid, int i, int j, int target, int currStep) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1) return 0;
        if (currStep+1 == target && grid[i][j] == 2) {
            return 1;
        }

        int temp = grid[i][j];
        grid[i][j] = -1;
        int res = dfs(grid, i, j-1, target, currStep+1) + dfs(grid, i, j+1, target, currStep+1) + dfs(grid, i-1, j, target, currStep+1) + dfs(grid, i+1, j, target, currStep+1);
        grid[i][j] = temp;
        return res;
    }
}
