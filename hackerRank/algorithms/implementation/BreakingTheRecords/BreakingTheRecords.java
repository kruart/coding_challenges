package algorithms.implementation.BreakingTheRecords;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {
        int minimum = scores[0];
        int maximum = scores[0];
        int countMaxRecord = 0;
        int countMinRecord = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maximum) {
                maximum = scores[i];
                countMaxRecord++;
            } else if (scores[i] < minimum) {
                minimum = scores[i];
                countMinRecord++;
            }
        }
        return new int[]{countMaxRecord, countMinRecord};
    }

    public static void main(String[] args) {
        int[] records1 = breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1}); //2 4
        int[] records2 = breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42}); //4 0
        int[] records3 = breakingRecords(new int[]{12, 24, 10, 24}); //1 1

        Arrays.stream(records1).forEach(System.out::println);
        Arrays.stream(records2).forEach(System.out::println);
        Arrays.stream(records3).forEach(System.out::println);
    }
}
