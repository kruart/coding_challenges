package graph;

public class t03_efficientRoadNetwork {
    boolean efficientRoadNetwork(int n, int[][] roads) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 100;
            }
        }
        for (int[] r : roads) {
            matrix[r[0]][r[1]] = 1;
            matrix[r[1]][r[0]] = 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 0;
        }

        // Floyd Warshall algorithm https://www.geeksforgeeks.org/floyd-warshall-algorithm-dp-16/
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][k]+matrix[k][j] < matrix[i][j])
                        matrix[i][j] = matrix[i][k]+matrix[k][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 2) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        t03_efficientRoadNetwork t = new t03_efficientRoadNetwork();
        System.out.println(t.efficientRoadNetwork(6, new int[][] {{3,0},{4,0},{5,0},{2,1},{1,4},{2,3},{5,2}})); // true
        System.out.println(t.efficientRoadNetwork(6, new int[][] {{0,4},{5,0},{2,1},{1,4},{2,3},{5,2}})); // false
    }
}
