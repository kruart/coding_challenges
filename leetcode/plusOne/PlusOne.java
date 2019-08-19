package plusOne;

import java.util.Arrays;

// https://leetcode.com/problems/plus-one/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            // if digit less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] plusOne = new int[digits.length + 1];
        plusOne[0] = 1;
        return plusOne;
    }
}
