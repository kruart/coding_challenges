package UniquePaths;

// https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < m; i++) {
            matrix[0][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            matrix[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
            }
        }

        return matrix[n-1][m-1];
    }

    public static void main(String[] args) {
        UniquePaths u = new UniquePaths();
        System.out.println(u.uniquePaths(3, 2));
        System.out.println(u.uniquePaths(7, 3));
    }
}
