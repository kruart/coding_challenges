package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/remove-duplicates/problem
object RemoveDuplicatesFP {
  def main(args: Array[String]) {
    println(StdIn.readLine().distinct)
  }
}
