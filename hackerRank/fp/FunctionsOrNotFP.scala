package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/functions-or-not/problem
object FunctionsOrNotFP {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readLine().toInt

    for (_ <- 1 to n) {
      val map = scala.collection.mutable.Map.empty[Int, Int]
      val k = StdIn.readLine().toInt
      var isFunction = true
      (1 to k).foreach(i => {
        val args = StdIn.readLine().split(" ").map(_.toInt)
        if (map.contains(args(0)) && map(args(0)) != args(1)) {
            isFunction = false
        } else {
          map(args(0)) = args(1)
        }
      })
      println(if (isFunction) "YES" else "NO")
    }
  }
}
