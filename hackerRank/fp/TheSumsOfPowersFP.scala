package fp

// https://www.hackerrank.com/challenges/functional-programming-the-sums-of-powers/problem
object TheSumsOfPowersFP {
  def numberOfWays(X: Int, N: Int, num: Int = 1): Int = {
    val numToN = math.pow(num, N).toInt
    numToN match {
      case v if v > X => 0
      case v if v == X => 1
      case v => numberOfWays(X, N, num+1) + numberOfWays(X-v, N, num+1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(numberOfWays(10, 2))    //1
    println(numberOfWays(100, 2))   //3
  }
}
