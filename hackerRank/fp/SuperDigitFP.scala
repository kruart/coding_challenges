package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/super-digit/problem
object SuperDigitFP extends App {
  def superDigit(value: String, times: Long): Int = value match {
    case v if v.length == 1 => v.toInt
    case v => superDigit((times * v.foldLeft(0)((sum, v) => sum + v.asDigit)).toString, 1)
  }

  val Array(n, k) = StdIn.readLine().split(" ")
  println(superDigit(n, k.toLong))
}
