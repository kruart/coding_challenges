package java_;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-2d-array/problem
public class Java2DArray {
    private static final Scanner scanner = new Scanner(System.in);

    static int getHourglassMaxSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                int tempSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (tempSum > sum) {
                    sum = tempSum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int[][] arr1 = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };

        int[][] arr2 = new int[][]{
                {1, 1, 1, 0, 0, 7},
                {0, 1, 0, 0, 5, 0},
                {1, 1, 1, 0, 8, 0},
                {0, 9, 2, 9, 4, 0},
                {0, 0, 0, -2, 8, 0},
                {0, 0, -1, 2, 7, 7}
        };

        int[][] arr3 = new int[][]{
                {0, -4, -6, 0, -7, -6},
                {-1, -2, -6, -8, -3, -1},
                {-8, -4, -2, -8, -8, -6},
                {-3, -1, -2, -5, -7, -4},
                {-3, -5, -3, -6, -6, -6},
                {-3, -6, 0, -8, -6, -7}
        };

        System.out.println(getHourglassMaxSum(arr));    //19
        System.out.println(getHourglassMaxSum(arr1));   //13
        System.out.println(getHourglassMaxSum(arr2));   //37
        System.out.println(getHourglassMaxSum(arr3));   //-19
    }
}
