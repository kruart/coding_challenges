package algorithms.BigSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/big-sorting/problem
public class BigSorting {
    static String[] bigSorting(String[] unsorted) {
        Comparator<String> c = (s1, s2) -> s1.length() == s2.length() ? s1.compareTo(s2) : Integer.compare(s1.length(), s2.length());
        return Arrays.stream(unsorted)
                .sorted(c)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = sc.next();
        }

        for (String s : bigSorting(unsorted)) {
            System.out.println(s);
        }
    }
}