package binaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-right-side-view/
public class BinaryTreeRightSideView {
    // bfs
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return ans;
        q.add(root);

        while (!q.isEmpty()) {
            int N = q.size();

            for (int i = 0; i < N; i++) {
                TreeNode node = q.poll();
                if (i == N-1) ans.add(node.val);
                if (node.right != null) q.add(node.right);
                if (node.left != null) q.add(node.left);
            }
        }
        return ans;
    }

    // dfs
    public List<Integer> rightSideView2(TreeNode root) { ;
        return rightView(root, 0, new ArrayList<>());
    }

    private List<Integer> rightView(TreeNode node, int level, List<Integer> l) {
        if (node == null) return l;

        if (l.size() == level) l.add(node.val);

        rightView(node.right, level+1, l);
        rightView(node.left, level+1, l);
        return l;
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
