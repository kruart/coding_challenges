package pathSum

// https://leetcode.com/problems/path-sum/
object PathSumS {
  def hasPathSum(root: TreeNode, sum: Int): Boolean = {
    if (root == null) return false
    if (root.left == null && root.right == null) return root._value == sum

    hasPathSum(root.left, sum - root._value) || hasPathSum(root.right, sum - root._value)
  }
  // for compilation
  case class TreeNode(var _value: Int, left: TreeNode = null, right: TreeNode = null)
}
