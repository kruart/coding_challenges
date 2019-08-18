package maximumLevelSumOfABinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currentLevel = 1;
        int maxSum = 0;
        int levelOfMaxSum = 1;

        while (!q.isEmpty()) {
            int levelSum = 0;

            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                levelSum += node.val;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            if (levelSum > maxSum) {
                maxSum = levelSum;
                levelOfMaxSum = currentLevel;
            }
            currentLevel++;
        }
        return levelOfMaxSum;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x, TreeNode left, TreeNode right) {
            val = x;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        MaximumLevelSumOfABinaryTree m = new MaximumLevelSumOfABinaryTree();
        System.out.println(m.maxLevelSum(
                new TreeNode(1, new TreeNode(7, new TreeNode(7, null, null), new TreeNode(-8, null, null)), new TreeNode(0, null, null))
        ));
    }
}
