package algorithms.NonDivisibleSubset

import scala.collection.mutable.ListBuffer

// https://www.hackerrank.com/challenges/non-divisible-subset/problem
object NonDivisibleSubsetSc {
  def nonDivisibleSubset(k: Int, S: Array[Int]): Int = {
    val arr = ListBuffer.fill[Int](k)(0)
    S.foreach( v => arr(v % k) += 1)
    val count = (1 to k / 2).foldLeft(math.min(arr.head, 1))((acc, v) => if (v != k - v) acc + math.max(arr(v), arr(k - v)) else acc)
    if (k % 2 == 0) count + 1 else count  //if no pair +1
  }

  def main(args: Array[String]): Unit = {
    println(nonDivisibleSubset(3, Array(1, 7, 2, 4)))   // 3
    println(nonDivisibleSubset(7, Array(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436)))   // 11
  }
}
