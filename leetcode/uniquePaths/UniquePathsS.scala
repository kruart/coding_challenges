package uniquePaths

// https://leetcode.com/problems/unique-paths/
object UniquePathsS {
  def uniquePaths(m: Int, n: Int): Int = {
    val arr = Array.ofDim[Int](n, m)
    (0 until n).foreach(arr(_)(0) = 1)
    (0 until m).foreach(arr(0)(_) = 1)

    for (i <- 1 until n; j <- 1 until m) {
      arr(i)(j) = arr(i)(j-1) + arr(i-1)(j)
    }

    arr(n-1)(m-1)
  }
}