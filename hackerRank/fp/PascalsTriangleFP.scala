package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/pascals-triangle/problem
object PascalsTriangleFP {
  def main(args: Array[String]) {
    val n = StdIn.readLine().toInt

    (1 to n).foreach(row => {
      (1 to row).foreach(col => {
        print(pascal(row, col) + " ")
      })
      println()
    })

    def pascal(r: Int, c: Int): Int = (r, c) match {
      case (`r`, `c`) if `c` == 1 || `r` == `c` => 1
      case _ => pascal(r - 1, c) + pascal(r - 1, c - 1)
    }
  }
}
