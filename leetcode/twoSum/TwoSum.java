package twoSum;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();  // num -> idx

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (m.containsKey(diff)) {
                return new int[]{m.get(diff), i};
            }
            m.put(nums[i], i);
        }
        return new int[]{};
    }
}
