package algorithms.warmup.DiagonalDifference;

// https://www.hackerrank.com/challenges/diagonal-difference/problem
public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {
        int leftToRight = 0, rightToLeft = 0;

        for (int i = 0; i < arr.length; i++) {
            leftToRight += arr[i][i];
            rightToLeft += arr[i][arr.length - i - 1];
        }
        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };
        int[][] matrix2 = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        System.out.println(diagonalDifference(matrix1));    //15 - 17 = 2
        System.out.println(diagonalDifference(matrix2));    //4 - 19 = 15

    }
}
