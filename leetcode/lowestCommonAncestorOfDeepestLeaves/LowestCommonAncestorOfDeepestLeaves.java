package lowestCommonAncestorOfDeepestLeaves;

// https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
public class LowestCommonAncestorOfDeepestLeaves {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        // find height of left and right nodes
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);

        // if heights of left and right nodes equal than lowest common ancestor is root node
        // otherwise if left > right check recursively left side
        // otherwise if right > left check recursively left side
        if (leftH == rightH) return root;
        else if (leftH > rightH) return lcaDeepestLeaves(root.left);
        else return lcaDeepestLeaves(root.right);
    }

    // calculate height/depth of node
    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        int leftH = 0;
        int rightH = 0;

        if (node.left != null) {
            leftH += getHeight(node.left);
        }
        if (node.right != null) {
            rightH += getHeight(node.right);
        }
        return Math.max(leftH, rightH) + 1;
    }

    // for compilation
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
