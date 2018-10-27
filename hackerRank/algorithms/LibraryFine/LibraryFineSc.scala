package algorithms.LibraryFine

import java.time.LocalDate

// https://www.hackerrank.com/challenges/library-fine/problem
object LibraryFineSc {
  def libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int = {
    val (returned, expected) = (LocalDate.of(y1, m1, d1), LocalDate.of(y2, m2, d2))
    if (returned.isBefore(expected) || returned.isEqual(expected)) 0
    else if (y1 - y2 > 0) 10000
    else if (m1 - m2 > 0) (m1 - m2) * 500
    else  (d1 - d2) * 15
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val (d1, m1, y1) = stdin.readLine.split(" ") match {case Array(e1, e2, e3) => (e1.toInt, e2.toInt, e3.toInt)}
    val (d2, m2, y2) = stdin.readLine.split(" ") match {case Array(e1, e2, e3) => (e1.toInt, e2.toInt, e3.toInt)}

    val result = libraryFine(d1, m1, y1, d2, m2, y2)
    println(result)
  }
}
