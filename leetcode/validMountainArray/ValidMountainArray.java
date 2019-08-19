package validMountainArray;

import java.util.Arrays;

// https://leetcode.com/problems/valid-mountain-array/
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int idx = 0;

        while (idx+1 < A.length && A[idx] < A[idx+1]) {
            idx++;
        }

        if (idx == 0 || idx >= A.length-1) return false;

        while (idx+1 < A.length) {
            if (A[idx+1] >= A[idx++]) return false;
        }
        return true;
    }
}
