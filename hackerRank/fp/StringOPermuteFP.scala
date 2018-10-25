package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/string-o-permute/problem
object StringOPermuteFP {
  def main(args: Array[String]) {
    val n = StdIn.readInt()

    (0 until n).foreach(_ => {
      println(StdIn.readLine().grouped(2).map(_.reverse).mkString(""))
    })
  }
}
