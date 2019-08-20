package bestTimeToBuyAndSellStock

object BestTimeToBuyAndSellStockS {
  def maxProfit(prices: Array[Int]): Int = {
    if (prices.length <= 1) return 0
    var min = prices(0)
    var profit = -1

    // 7,1,5,3,6,4
    prices.tail.foreach{ it =>
      profit = Math.max(profit, it - min)
      min = Math.min(min, it)
    }

    if (profit == -1) 0 else profit
  }

  def main(args: Array[String]): Unit = {
    println(maxProfit(Array(7,1,5,3,6,4)))
    println(maxProfit(Array(7,6,4,3,1)))
  }
}
