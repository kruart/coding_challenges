package data_structures.DynamicArray

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

// https://www.hackerrank.com/challenges/dynamic-array/problem
object DynamicArrayScala {
  def dynamicArray(n: Int, queries: Array[Array[Int]]): Unit = {
    val seqList = Array.fill[ArrayBuffer[Int]](n)(ArrayBuffer())
    var lastAnswer = 0

    queries.foreach { query =>
      val (x, y) = (query(1), query(2))
      val seq = seqList((x ^ lastAnswer) % n)

      if (query(0) == 1) seq += y
      else {
        lastAnswer = seq(y % seq.length)
        println(lastAnswer)
      }
    }
  }

  def main(args: Array[String]) {
    val read = () => StdIn.readLine
    val Array(n, q) = read().split(" ").map(_.toInt)
    val seq = (0 until q).map(_ => read().split(" ").map(_.trim.toInt)).toArray
    dynamicArray(n, seq)
  }
}
