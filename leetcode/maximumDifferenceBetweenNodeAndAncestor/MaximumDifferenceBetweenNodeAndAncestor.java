package maximumDifferenceBetweenNodeAndAncestor;

// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
public class MaximumDifferenceBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return getMax(root, root.val, root.val);
    }

    private int getMax(TreeNode node, int min, int max) {
        if (node == null) return max-min;

        min = Math.min(node.val, min);
        max = Math.max(node.val, max);
        int leftAns = getMax(node.left, min, max);
        int rightAns = getMax(node.right, min, max);
        return Math.max(leftAns, rightAns);
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
