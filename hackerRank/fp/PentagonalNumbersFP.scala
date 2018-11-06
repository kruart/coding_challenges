package fp

import scala.io.Source

// https://www.hackerrank.com/challenges/pentagonal-numbers/problem
object PentagonalNumbersFP {
  def main(args: Array[String]) {
    //formula: https://math.stackexchange.com/questions/453562/formula-for-pentagonal-numbers
    Source.stdin.getLines().drop(1).map(_.toLong)
      .foreach(n => println(n * (3*n - 1) / 2))
  }
}
