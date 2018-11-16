package fp

import scala.io.StdIn.{readInt => rInt}

// https://www.hackerrank.com/challenges/fibonacci-fp/problem
object FibonacciFP extends App {
  def fib(n: Int): Long = {
    def fib_tail(n: Int, a: Long, b: Long): Long = n match {
      case 0 => a
      case _ => fib_tail(n-1, b, (a + b) % mod)
    }
    fib_tail(n, 0, 1)
  }

  val mod = math.pow(10, 8).toInt + 7
  for (_ <- 1 to rInt) println(fib(rInt))
}
