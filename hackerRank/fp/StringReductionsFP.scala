package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/string-reductions/problem
object StringReductionsFP {
  def main(args: Array[String]) {
    println(StdIn.readLine().distinct)
  }
}
