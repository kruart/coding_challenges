package algorithms.ElectronicsShop

// https://www.hackerrank.com/challenges/electronics-shop/problem
object ElectronicsShopSc {
  def getMoneySpent(kboards: Array[Int], drives: Array[Int], b: Int): Int = {
    var max = -1
    for (
      k <- kboards;
      d <- drives; sum = k + d; if sum <= b && sum > max) max = sum
    max
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val Array(b, _, _) = stdin.readLine().split(" ").map(_.toInt)
    val keyboards = stdin.readLine.split(" ").map(_.trim.toInt)
    val drives = stdin.readLine.split(" ").map(_.trim.toInt)

    val moneySpent = getMoneySpent(keyboards, drives, b)
    println(moneySpent)
  }
}
