package subsets;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void subsets(int[] nums, int level, List<Integer> subset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(subset));

        while (level < nums.length) {
            subset.add(nums[level]);
            subsets(nums, ++level, subset, subsets);
            subset.remove(subset.size()-1);
        }
    }
}
