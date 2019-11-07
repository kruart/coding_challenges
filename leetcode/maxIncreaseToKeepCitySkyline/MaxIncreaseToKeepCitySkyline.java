package maxIncreaseToKeepCitySkyline;

// https://leetcode.com/problems/max-increase-to-keep-city-skyline/
public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxRows = new int[grid.length];
        int[] maxCols = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxRows[i] = Math.max(maxRows[i], grid[i][j]);
                maxCols[j] = Math.max(maxCols[j], grid[i][j]);
            }
        }

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sum += Integer.min(maxRows[i], maxCols[j]) - grid[i][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(new MaxIncreaseToKeepCitySkyline().maxIncreaseKeepingSkyline(new int[][]{
                {3,0,8,4},
                {2,4,5,7},
                {9,2,6,3},
                {0,3,1,0}
        }));
    }
}
