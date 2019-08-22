package minimumSizeSubarraySum;

import groovy.json.JsonOutput;

// https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        if (nums[0] >= s) return 1;

        int i = 0, j = 1;
        int sum = nums[0], minLen = Integer.MAX_VALUE;

        while (j < nums.length) {
            if (sum + nums[j] < s) sum += nums[j++];
            else {
                minLen = Math.min(minLen, j-i+1);
                sum -= nums[i++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
