package sameTree

// https://leetcode.com/problems/same-tree/
object SameTreeS {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null) return true
    if (p == null || q == null || p._value != q._value) return false
    isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
  }

  case class TreeNode(var _value: Int, left: TreeNode, right:TreeNode)


  def main(args: Array[String]): Unit = {
    isSameTree(
      TreeNode(1, TreeNode(2, null,null), TreeNode(3, null,null)),
      TreeNode(1, TreeNode(2, null,null), TreeNode(3, null,null))
    )
  }
}
