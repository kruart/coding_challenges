package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/rotate-string/problem
object RotateStringFP {
  def main(args: Array[String]) {
    val N = StdIn.readInt()

    //way 1
    (0 until N).foreach(_ => {
      val str = StdIn.readLine()
      val result = (for (i <- 1 until str.length) yield str.drop(i) + str.take(i)) :+ str
      println(result.mkString(" "))
    })

    //    //way 2
    //    (0 until N).map(_ => StdIn.readLine())
    //      .map(l => l.scanLeft(l)((res, _) => res.tail + res.head).drop(1).mkString(" ")).foreach(println)
  }
}
