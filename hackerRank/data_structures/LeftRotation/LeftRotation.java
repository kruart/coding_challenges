package data_structures.LeftRotation;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.hackerrank.com/challenges/array-left-rotation/problem
public class LeftRotation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[(i+n-d)%n] = aItem;
        }

        String collect = IntStream.of(a).mapToObj(String::valueOf).collect(Collectors.joining( " "));
        System.out.println(collect);
        scanner.close();
    }
}
