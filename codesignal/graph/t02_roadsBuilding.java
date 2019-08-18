package graph;

import java.util.Arrays;

public class t02_roadsBuilding {
    int[][] roadsBuilding(int cities, int[][] roads) {
        boolean[][] roadsMatrix = new boolean[cities][cities];

        for (int[] road : roads) {
            roadsMatrix[road[0]][road[1]] = true;
            roadsMatrix[road[1]][road[0]] = true;
        }

        int restNumOfRoads = ((cities * (cities - 1)) / 2) - roads.length;  // num of edges
        int[][] restRoads = new int[restNumOfRoads][2];
        int count = 0;

        for (int i = 0; i < roadsMatrix.length; i++) {
            for (int j = 0; j < roadsMatrix.length; j++) {
                if (i != j && !roadsMatrix[i][j]) {
                    restRoads[count++] = new int[] {i, j};
                    roadsMatrix[j][i] = true;
                }
            }
        }
        return restRoads;
    }


    public static void main(String[] args) {
        t02_roadsBuilding m = new t02_roadsBuilding();
        System.out.println(
                Arrays.deepToString (
                        m.roadsBuilding(4, new int[][]{{0, 1}, {1, 2}, {2, 0}}
                )));
    }
}
