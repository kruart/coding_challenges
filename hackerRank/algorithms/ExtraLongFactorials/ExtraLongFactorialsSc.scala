package algorithms.ExtraLongFactorials

// https://www.hackerrank.com/challenges/extra-long-factorials/problem
object ExtraLongFactorialsSc {
  def extraLongFactorials(n: Int) {
    val fac = (2 to n).foldLeft(BigInt(1)) { (acc, value) => acc * value }
    println(fac)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    extraLongFactorials(n)
  }
}
