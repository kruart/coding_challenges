package climbingStairs;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        // int[] dp = new int[n];
        // dp[0] = 1;
        // dp[1] = 2;
        int prev = 1;
        int curr = 2;

        for (int i = 2; i < n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
            // dp[i] = dp[i-1] + dp[i+2];
        }
        return curr;
        // return dp[n-1];
    }
}
