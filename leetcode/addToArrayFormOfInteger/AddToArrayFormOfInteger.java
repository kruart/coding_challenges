package addToArrayFormOfInteger;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new LinkedList<>();
        int n1 = A.length-1;
        int carry = K;

        while (n1 >= 0 || carry != 0) {
            int sum = carry;
            if (n1 >= 0) sum += A[n1--];

            int lastDigit = sum % 10;
            ans.add(0, lastDigit);
            carry = sum / 10;
        }
        return ans;
    }
}
