package bitwiseAndOfNumbersRange

// https://leetcode.com/problems/bitwise-and-of-numbers-range/
object BitwiseAndOfNumbersRangeS {
  def rangeBitwiseAnd(m: Int, n: Int): Int = {
    var res = n
    while (res > m) {
      println(res)
      println(res.toBinaryString)
      res = res & res - 1 // clear the lowest set bit of res
    }
    println(res)
    m & res
  }

  def main(args: Array[String]): Unit = {
    println(rangeBitwiseAnd(15, 30))
//    println(rangeBitwiseAnd(0, 2147483647))
  }
}
