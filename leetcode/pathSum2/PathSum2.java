package pathSum2;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/path-sum-ii/
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        pathSum(root, sum, new ArrayList<>(), paths);
        return paths;
    }

    private void pathSum(TreeNode node, int sum, List<Integer> path, List<List<Integer>> paths) {
        if (node == null) return;

        path.add(node.val);
        if (node.left == null && node.right == null && sum - node.val == 0) {
            paths.add(new ArrayList<>(path));
        }
        pathSum(node.left, sum - node.val, path, paths);
        pathSum(node.right, sum - node.val, path, paths);
        path.remove(path.size()-1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
