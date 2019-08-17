package monotonicArray;

// https://leetcode.com/problems/monotonic-array/
public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 2) return true;

        boolean increase = false;
        boolean decrease = false;
        for (int i = 1; i < A.length; i++) {
            int diff = A[i] - A[i-1];
            if (diff > 0) increase = true;
            if (diff < 0) decrease = true;
            if (increase && decrease) return false;
        }

        return true;
    }
}
