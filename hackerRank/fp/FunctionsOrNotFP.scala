package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/functions-or-not/problem
object FunctionsOrNotFP {
  //more functional way
  def main(args: Array[String]): Unit = {
    val read = () => StdIn.readLine

    for (_ <- 1 to read().toInt) {
      val isFunc = (1 to read().toInt).map(_ => read().split(" "))
        .groupBy(_(0))
        .forall(_._2.distinct.size == 1)

      println(if (isFunc) "YES" else "NO")
    }
  }

  //way 1
  //  def main(args: Array[String]): Unit = {
  //    val n = StdIn.readLine().toInt
  //
  //    for (_ <- 1 to n) {
  //      val map = scala.collection.mutable.Map.empty[Int, Int]
  //      val k = StdIn.readLine().toInt
  //      var isFunction = true
  //      (1 to k).foreach(i => {
  //        val args = StdIn.readLine().split(" ").map(_.toInt)
  //        if (map.contains(args(0)) && map(args(0)) != args(1)) {
  //            isFunction = false
  //        } else {
  //          map(args(0)) = args(1)
  //        }
  //      })
  //      println(if (isFunction) "YES" else "NO")
  //    }
  //  }
}
