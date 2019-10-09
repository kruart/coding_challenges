package combinationSum3;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum-iii/
public class CombinationSum3 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k, n, 1, new ArrayList<>());
        return ans;
    }

    private void dfs(int k, int target, int idx, List<Integer> comb) {
        if (comb.size() > k) return;
        if (comb.size() == k) {
            if (target == 0) ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = idx; i <= 9; i++) {
            comb.add(i);
            dfs(k, target-i, i+1, comb);
            comb.remove(comb.size()-1);
        }
    }
}
