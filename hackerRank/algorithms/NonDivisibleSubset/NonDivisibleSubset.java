package algorithms.NonDivisibleSubset;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://www.hackerrank.com/challenges/non-divisible-subset/problem
public class NonDivisibleSubset {
    static int nonDivisibleSubset(int k, int[] S) {
        int[] arr = new int[k];
        Arrays.stream(S).forEach(i -> arr[i%k]++);
        int count = IntStream.range(1, k/2+1)
                .reduce(Math.min(arr[0], 1), (acc, v) -> v != k - v ? acc + Math.max(arr[v], arr[k-v]) : acc);

        return k % 2 == 0 ? count+1 : count;
    }

    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3, new int[]{1, 7, 2, 4}));   // 3
        System.out.println(nonDivisibleSubset(
                7, new int[]{278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436}));   // 11
    }
}
