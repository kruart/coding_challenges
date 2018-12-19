package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/common-divisors/problem
object CommonDivisorsFP extends  App {
  def cd(x: Int, y: Int): Int = {
    var count: Int = 0

    for (i <- 1 to math.min(x, y)) {
      if (x % i == 0 && y % i == 0) count = count + 1
    }
    count
  }

  val n = StdIn.readInt()
  (1 to n).foreach(_ -> {
    val Array(x, y) = StdIn.readLine().split(" ").map(_.toInt)
    println(cd(x, y))
  })
}
