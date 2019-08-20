package containsDuplicate2;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i]) && i - m.get(nums[i]) - 1 <= k) {
                return true;
            }
            m.put(nums[i], i);
        }
        return false;
    }
}
