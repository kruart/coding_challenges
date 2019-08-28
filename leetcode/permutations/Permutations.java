package permutations;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, new ArrayList<>(), ans);
        return ans;
    }

    private void permute(int[] nums, List<Integer> permutation, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for (int num : nums) {
            if (!permutation.contains(num)) {
                permutation.add(num);
                permute(nums, permutation, permutations);
                permutation.remove(permutation.size()-1);
            }
        }
    }
}
