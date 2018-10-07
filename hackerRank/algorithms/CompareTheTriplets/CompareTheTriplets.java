package algorithms.CompareTheTriplets;

//https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if(a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        return Arrays.asList(aliceScore, bobScore);
    }

    public static void main(String[] args) {
        List<Integer> aliceRates = Arrays.asList(17, 28, 30);
        List<Integer> bobRates = Arrays.asList(99, 16, 8);
        System.out.println(compareTriplets(aliceRates, bobRates));

        List<Integer> aliceRates2 = Arrays.asList(5, 6, 7);
        List<Integer> bobRates2 = Arrays.asList(3, 6, 10);
        System.out.println(compareTriplets(aliceRates2, bobRates2));
    }
}
