package uniquePaths2

// https://leetcode.com/problems/unique-paths-ii/
object UniquePaths2S {
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    val N = obstacleGrid.length
    val M = obstacleGrid(0).length
    val arr = Array.ofDim[Int](N, M)

    (0 until N).takeWhile(obstacleGrid(_)(0) == 0).foreach(arr(_)(0) = 1)
    (0 until M).takeWhile(obstacleGrid(0)(_) == 0).foreach(arr(0)(_) = 1)

    for {
      i <- 1 until N;
      j <- 1 until M;
      if obstacleGrid(i)(j) != 1
    } arr(i)(j) = arr(i)(j-1) + arr(i-1)(j)

    arr(N-1)(M-1)
  }
}
