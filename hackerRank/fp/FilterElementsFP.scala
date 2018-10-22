package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/filter-elements/problem
object FilterElementsFP {
  def main(args: Array[String]) {
    val n = StdIn.readInt()
    (0 until n).foreach(_ => {
      val args = StdIn.readLine().split(" ")
      val arr = StdIn.readLine().split(" ").map(_.toInt)
      val result = filterElements(args(1).toInt, arr)
      println(if (!result.isEmpty) result.mkString(" ") else -1)
    })
  }

  def filterElements(k: Int, arr: Array[Int]): Array[Int] = {
    // arr.distinct.filter(i => arr.count(_ == i) >= k)  //O(n)  - timeout error
    val occurences = arr.groupBy(identity).mapValues(_.length)  //O(1)
    arr.distinct.filter(occurences(_) >= k)
  }
}
