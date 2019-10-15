package houseRobber2;

// https://leetcode.com/problems/house-robber-ii/
public class HouseRobber2 {
    public int rob(int[] nums) {
        int N = nums.length;
        if (N < 2) return N == 0 ? 0 : nums[0];
        if (N == 2) return Math.max(nums[0], nums[1]);
        return Math.max(rob(nums, 0, N-2), rob(nums, 1, N-1));
    }

    private int rob(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start], nums[start+1]);

        for (int i = start+2; i <= end; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[end];
    }

    public static void main(String[] args) {
        HouseRobber2 hr = new HouseRobber2();
        System.out.println(hr.rob(new int[] {2,3,2}));          // 3
        System.out.println(hr.rob(new int[] {2,1,1,2}));        // 3
        System.out.println(hr.rob(new int[] {1,2,1,1}));        // 3
        System.out.println(hr.rob(new int[] {1,2,3,1}));        // 4
        System.out.println(hr.rob(new int[] {1,2,1,2,2}));      // 4
        System.out.println(hr.rob(new int[] {4,6,3,1,7,4}));    // 14
        System.out.println(hr.rob(new int[] {3,5,7,2,1,1,9}));  // 17
    }
}
