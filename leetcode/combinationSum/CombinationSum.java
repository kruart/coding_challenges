package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
public class CombinationSum {
    List<Integer> combination = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0);
        return ans;
    }

    private void combinationSum(int[] candidates, int target, int from) {
        if (target == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }

        for (int i = from; i < candidates.length; i++) {
            int c = candidates[i];
            if (c > target) break;
            combination.add(c);
            combinationSum(candidates, target - c, i);
            combination.remove(combination.size()-1);
        }
    }
}
