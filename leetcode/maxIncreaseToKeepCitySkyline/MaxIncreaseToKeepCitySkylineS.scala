package maxIncreaseToKeepCitySkyline

// https://leetcode.com/problems/max-increase-to-keep-city-skyline/
object MaxIncreaseToKeepCitySkylineS {
  def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
    val maxRows = Array.ofDim[Int](grid.length)
    val maxCols = Array.ofDim[Int](grid(0).length)

    for {i <- grid.indices; j <- grid(0).indices} {
      maxRows(i) = Math.max(maxRows(i), grid(i)(j))
      maxCols(j) = Math.max(maxCols(j), grid(i)(j))
    }

    var sum = 0
    for {i <- grid.indices; j <- grid(0).indices} {
      sum += Math.min(maxRows(i), maxCols(j)) - grid(i)(j)
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    maxIncreaseKeepingSkyline(Array(
      Array(3, 0, 8, 4),
      Array(2, 4, 5, 7),
      Array(9, 2, 6, 3),
      Array(0, 3, 1, 0)
    ))
  }
}
