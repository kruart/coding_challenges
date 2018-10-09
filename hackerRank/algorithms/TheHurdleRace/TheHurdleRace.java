package algorithms.TheHurdleRace;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/the-hurdle-race/problem
public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int max = Arrays.stream(height).max().getAsInt();
        return k - max >= 0 ? 0 : max - k;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];
        String[] heightItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);
        System.out.println(result);

        scanner.close();
    }
}
