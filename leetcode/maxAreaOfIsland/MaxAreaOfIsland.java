package maxAreaOfIsland;

// https://leetcode.com/problems/max-area-of-island/
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, calculateArea(grid, i, j));
                }
            }
        }
        return max;
    }

    private int calculateArea(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + calculateArea(grid, i+1, j) + calculateArea(grid, i-1, j) + calculateArea(grid, i, j+1) + calculateArea(grid, i, j-1);
    }
}
