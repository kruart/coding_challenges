package missingNumberInArithmeticProgression;

// https://leetcode.com/problems/missing-number-in-arithmetic-progression/
public class MissingNumberInArithmeticProgression {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int d = Math.abs(arr[n-1] - arr[0]) / n;

        for (int i = 0; i < n-1; i++) {
            if (Math.abs(arr[i+1] - arr[i]) != d) {
                return arr[i] < arr[i+1] ? arr[i] + d : arr[i] - d;
            }
        }
        return 0;
    }
}
