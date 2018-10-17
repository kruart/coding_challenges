package algorithms.FormingAMagicSquare

import scala.math.abs

object FormingAMagicSquareSc {
  val possibleCombinations = Array(
    Array(Array(8, 1, 6), Array(3, 5, 7), Array(4, 9, 2)),// 1
    Array(Array(6, 1, 8), Array(7, 5, 3), Array(2, 9, 4)),// 2
    Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 6)),// 3
    Array(Array(2, 9, 4), Array(7, 5, 3), Array(6, 1, 8)),// 4
    Array(Array(8, 3, 4), Array(1, 5, 9), Array(6, 7, 2)),// 5
    Array(Array(4, 3, 8), Array(9, 5, 1), Array(2, 7, 6)),// 6
    Array(Array(6, 7, 2), Array(1, 5, 9), Array(8, 3, 4)),// 7
    Array(Array(2, 7, 6), Array(9, 5, 1), Array(4, 3, 8)),// 8
  )

  def formingMagicSquare(s: Array[Array[Int]]): Int = {
    var minCost = Int.MaxValue
    for (i <- possibleCombinations.indices) {
      var tempCost = 0
      for (j <- s.indices) {
        for (k <- s.indices) {
          tempCost += abs(possibleCombinations(i)(j)(k) - s(j)(k))
        }
      }
      if (minCost > tempCost) minCost = tempCost
    }
    minCost
  }

  def main(args: Array[String]): Unit = {
    println(formingMagicSquare(Array(
      Array(5, 3, 4),
      Array(1, 5, 8),
      Array(6, 4, 2))))//7

    println(formingMagicSquare(Array(
      Array(4, 9, 2),
      Array(3, 5, 7),
      Array(8, 1, 5))))//1

    println(formingMagicSquare(Array(
      Array(4, 8, 2),
      Array(4, 5, 7),
      Array(6, 1, 6))))//4
  }
}
