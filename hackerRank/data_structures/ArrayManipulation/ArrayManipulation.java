package data_structures.ArrayManipulation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/crush/problem
public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 2];
        long max = Long.MIN_VALUE;
        long sum = 0;

        for (int[] query : queries) {
                arr[query[0]] += query[2];
                arr[query[1]+1] -= query[2];
        }

        for (long item : arr) {
            sum += item;
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);

        scanner.close();
    }
}