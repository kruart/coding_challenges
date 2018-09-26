package java_;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-negative-subarray/problem
public class JavaSubarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = scanner.nextInt();
        }

        System.out.println(totalNegativeSubArrays(intArr));
    }

    private static int totalNegativeSubArrays(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                if (tempSum < 0) total++;
            }
        }
        return total;
    }
}
