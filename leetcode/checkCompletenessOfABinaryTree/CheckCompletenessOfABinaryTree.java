package checkCompletenessOfABinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/check-completeness-of-a-binary-tree/
public class CheckCompletenessOfABinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean isNullExist = false;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) isNullExist = true;
            else if (isNullExist) return false;
            else {
                q.add(node.left);
                q.add(node.right);
            }
        }
        return true;
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
