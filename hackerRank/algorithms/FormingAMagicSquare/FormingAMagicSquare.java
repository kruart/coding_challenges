package algorithms.FormingAMagicSquare;

// https://www.hackerrank.com/challenges/magic-square-forming/problem
public class FormingAMagicSquare {
    static int[][][] possibleCombinations = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},// 1
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},// 2
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},// 3
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},// 4
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},// 5
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},// 6
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},// 7
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},// 8
    };

    static int formingMagicSquare(int[][] s) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < possibleCombinations.length; i++) {
            int tempCost = 0;
            for (int j = 0; j < s.length; j++) {
                for (int k = 0; k < s.length; k++) {
                    tempCost += Math.abs(possibleCombinations[i][j][k] - s[j][k]);
                }
            }
            if (minCost > tempCost) minCost = tempCost;
        }
        return minCost;
    }

    public static void main(String[] args) {
        System.out.println(formingMagicSquare(new int[][]{
                {5, 3, 4},
                {1, 5, 8},
                {6, 4, 2}})); //7

        System.out.println(formingMagicSquare(new int[][]{
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 5}})); //1

        System.out.println(formingMagicSquare(new int[][]{
                {4, 8, 2},
                {4, 5, 7},
                {6, 1, 6}})); //4
    }
}
