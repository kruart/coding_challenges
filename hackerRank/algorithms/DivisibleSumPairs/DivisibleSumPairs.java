package algorithms.DivisibleSumPairs;

// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 5, new int[]{1, 2, 3, 4, 5, 6}));   //3
        System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));   //5
    }
}
