package combinations;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/
public class Combinations {
    List<Integer> combination = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        combine(1, n, k);
        return ans;
    }

    private void combine(int from, int to, int k) {
        if (k == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }

        for (int i = from; i <= to-k+1; i++) {
            combination.add(i);
            combine(i+1, to, k-1);
            combination.remove(combination.size()-1);
        }
    }
}
