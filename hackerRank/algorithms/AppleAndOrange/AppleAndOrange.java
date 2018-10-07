package algorithms.AppleAndOrange;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/apple-and-orange/problem
public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        long applesInARange = Arrays.stream(apples)
                .filter(apple -> (a + apple) >= s && (a + apple) <= t)
                .count();
        long orangesInARange = Arrays.stream(oranges)
                .filter(orange -> (b + orange) >= s && (b + orange) <= t)
                .count();
        System.out.println(applesInARange);
        System.out.println(orangesInARange);
    }

    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }
}
