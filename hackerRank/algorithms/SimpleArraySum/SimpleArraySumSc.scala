package algorithms.SimpleArraySum

import scala.io.StdIn

object SimpleArraySumSc {
  def simpleArraySum(ar: Array[Int]): Int = {
    ar.sum
  }

  def main(args: Array[String]): Unit = {
    val (_, ar: Array[Int]) = (StdIn.readLine, StdIn.readLine.split(" ").map(_.trim.toInt))
    println(simpleArraySum(ar))
  }
}
