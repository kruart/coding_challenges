package practiceProblems.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfSubarrayWith0SumIsExistsOrNot {

    public static void main (String[] args) {
        System.out.println(zeroSumSubarray(new int[]{ 4, -6, 3, -1, 4, 2, 7 }));
        System.out.println(zeroSumSubarray(new int[]{ 5, 8, 4, -4, 7, 7, -5 }));
    }

    private static Boolean zeroSumSubarray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int value : arr) {
            sum += value;

            if (set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}
