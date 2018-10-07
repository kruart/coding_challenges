package algorithms.AVeryBigSum;

import java.util.Arrays;

// warmup: https://www.hackerrank.com/challenges/a-very-big-sum/problem
public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005}));
    }
}
