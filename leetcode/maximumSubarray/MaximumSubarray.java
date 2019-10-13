package maximumSubarray;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;

        int max = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > sum + nums[i]) {
                sum = nums[i];
            }  else sum += nums[i];

            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        System.out.println(ms.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
}
