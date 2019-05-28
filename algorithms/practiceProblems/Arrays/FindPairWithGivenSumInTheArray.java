package practiceProblems.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPairWithGivenSumInTheArray {
    public static void main(String[] args) {
        findPair(new int[] {8, 7, 5, 5, 3, 1}, 10);
        findPair(new int[] {3, 5, 29, 11, 4, 7}, 12);
        findPair(new int[] {1, 1}, 3);
    }

    // O(n)
    private static void findPair(int[] arr, int sum) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];

            if (m.containsKey(diff)) {
                System.out.println(m.get(diff) + ":" + i);
                return;
            }
            m.put(arr[i], i);
        }
        System.out.println("None");
    }
}
