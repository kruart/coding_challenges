package algorithms.ThePowerSum

object ThePowerSumSc {
  def powerSum(X: Int, N: Int, num: Int = 1): Int = {
    val numToN = math.pow(num, N).toInt
    if (numToN > X) 0
    else if (numToN == X) 1
    else powerSum(X, N, num+1) + powerSum(X-numToN, N, num+1)
  }

  def main(args: Array[String]): Unit = {
    println(powerSum(10, 2))    //1
    println(powerSum(100, 2))   //3
  }
}
