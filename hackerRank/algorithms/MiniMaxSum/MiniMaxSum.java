package algorithms.MiniMaxSum;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MiniMaxSum {
    // first way
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - i - 1];
        }
        System.out.println(minSum + " " + maxSum);
    }

    // second way
    static void miniMaxSum2(int[] arr) {
        Arrays.sort(arr);
        long sum = 0;

        for (int anArr : arr) {
            sum += anArr;
        }
        System.out.println((sum - arr[arr.length - 1]) + " " + (sum - arr[0]));
    }

    public static void main(String[] args) {
        miniMaxSum(new int[]{1, 2, 3, 4, 5});       //10 14
        miniMaxSum(new int[]{7, 69, 2, 221, 8974}); //299 9271
        miniMaxSum(new int[]{999999995, 999999996, 999999997, 999999998, 999999999});

        miniMaxSum2(new int[]{1, 2, 3, 4, 5});       //10 14
        miniMaxSum2(new int[]{7, 69, 2, 221, 8974}); //299 9271
        miniMaxSum2(new int[]{999999995, 999999996, 999999997, 999999998, 999999999});
    }
}
