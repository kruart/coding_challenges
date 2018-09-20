package algorithms.warmup.PlusMinus;

// https://www.hackerrank.com/challenges/plus-minus/problem
public class PlusMinus {

    static void plusMinus(int[] arr) {
        float zeroCount = 0;
        float lessZeroCount = 0;
        float greaterZeroCount = 0;

        for (int i : arr) {
            if (i > 0) {
                greaterZeroCount++;
            } else if (i < 0) {
                lessZeroCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println(greaterZeroCount / arr.length);
        System.out.println(lessZeroCount / arr.length);
        System.out.println(zeroCount / arr.length);
    }

    public static void main(String[] args) {
        plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
        plusMinus(new int[]{1, 2, 3, -1, -2, -3, 0, 0});
    }
}
