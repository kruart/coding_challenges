package numberOfIslands;

// https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int countIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    countIslands++;
                    detectIsland(grid, i, j);
                }
            }
        }
        return countIslands;
    }

    private void detectIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;

        grid[i][j] = '0';
        detectIsland(grid, i+1, j);
        detectIsland(grid, i-1, j);
        detectIsland(grid, i, j+1);
        detectIsland(grid, i, j-1);
    }
}
