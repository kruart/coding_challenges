package perfectSquares;

import java.util.Arrays;

// https://leetcode.com/problems/perfect-squares/
public class PerfectSquares {
    public int numSquares(int n) {
        if (n == 0) return 0;

        int[] dp = new int[n+1];
        Arrays.fill(dp, n+1);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {
                int pow2 = j*j;
                dp[i] = Math.min(dp[i], dp[i - pow2] + 1);
            }
        }
        return dp[n];
    }
}
