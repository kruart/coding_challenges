package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/subset-sum/problem
object SubsetSumFP extends App {
  def subsetSum(src: Array[Long], num: Long): Int = {
    if (num > src.last) {
      -1
    } else {
      var start = 0
      var end = src.length - 1

      while (start < end) {
        val mid = (start + end) / 2
        if (src(mid) >= num) end = mid
        else start = mid + 1
      }
      start
    }
  }

  val _ = StdIn.readInt()
  val sums = StdIn.readLine()
    .split(" ")
    .map(_.toInt)
    .sorted(Ordering[Int].reverse)  // merge sort for Object types and quick sort for primitives
    .scanLeft(0L)(_ + _)            // List of sums

  (1 to StdIn.readInt()).foreach(_ => println(subsetSum(sums, StdIn.readLong())))
}
