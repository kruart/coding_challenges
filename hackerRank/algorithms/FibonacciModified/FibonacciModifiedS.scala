package algorithms.FibonacciModified

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

// https://www.hackerrank.com/challenges/fibonacci-modified/problem
object FibonacciModifiedS extends App {
  def fibonacciModified(t1: Int, t2: Int, n: Int): BigInt = {
    val ts = ListBuffer(BigInt(t1), BigInt(t2))
    (2 until n).foreach(i => ts += ts(i-2) + ts(i-1).pow(2))
    ts.last
  }

  val Array(t1, t2, n) = StdIn.readLine().split(" ").map(_.toInt)
  println(fibonacciModified(t1, t2, n))
}

