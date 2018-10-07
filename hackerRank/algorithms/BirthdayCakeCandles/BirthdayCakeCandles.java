package algorithms.BirthdayCakeCandles;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        int max = Arrays.stream(ar)
                .max()
                .getAsInt();

        return (int)Arrays.stream(ar)
                .filter(i -> i == max)
                .count();
    }

    static int birthdayCakeCandles2(int[] ar) {
        Arrays.sort(ar);
        return (int)Arrays.stream(ar)
                .filter(i -> i == ar[ar.length - 1])
                .count();
    }

    static int birthdayCakeCandlesInOneLoop(int[] ar) {
        int max = ar[0], count = 1;
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
                count = 0;
            } else if (max == ar[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{3, 2, 1, 3}));
        System.out.println(birthdayCakeCandles(new int[]{4, 2, 4, 4, 1, 3}));

        System.out.println(birthdayCakeCandles2(new int[]{3, 2, 1, 3}));
        System.out.println(birthdayCakeCandles2(new int[]{4, 2, 4, 4, 1, 3}));

        System.out.println(birthdayCakeCandlesInOneLoop(new int[]{3, 2, 1, 3}));
        System.out.println(birthdayCakeCandlesInOneLoop(new int[]{4, 2, 4, 4, 1, 3}));
    }
}
