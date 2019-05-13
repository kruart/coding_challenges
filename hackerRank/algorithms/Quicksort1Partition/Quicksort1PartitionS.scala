package algorithms.Quicksort1Partition

// https://www.hackerrank.com/challenges/quicksort1/problem
object Quicksort1PartitionS {
  def quickSort(arr: Array[Int]): Array[Int] = {
    if (arr.length <= 1) arr

    val pivot = arr.head
    var left = Array[Int]()
    var right = Array[Int]()

    arr.tail.foreach { el =>
      if (el < pivot) left = left :+ el
      else right = right :+ el
    }
    (left :+ pivot) ++: right
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val _ = stdin.readLine.trim.toInt
    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    println(quickSort(arr).mkString(" "))
  }
}