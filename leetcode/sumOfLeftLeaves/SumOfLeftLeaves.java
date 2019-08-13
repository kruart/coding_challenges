package sumOfLeftLeaves;

// https://leetcode.com/problems/sum-of-left-leaves/
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return getSum(root, false);
    }

    private int getSum(TreeNode node, boolean isLeft) {
        int res = 0;
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null && isLeft) {
            return res += node.val;
        }
        res += getSum(node.left, true) +  getSum(node.right, false);
        return res;
    }

    // for compilation purposes
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
