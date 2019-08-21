package longestContinuousIncreasingSubsequence;

// https://leetcode.com/problems/longest-continuous-increasing-subsequence/
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 1;
        int startSeq = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) startSeq = i;
            max = Math.max(max, i - startSeq + 1);
        }
        return max;
    }
}
