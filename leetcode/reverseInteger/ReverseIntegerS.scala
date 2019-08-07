package reverseInteger

// https://leetcode.com/problems/reverse-integer/
object ReverseIntegerS extends App {
  def reverse(x: Int): Int = {
    @scala.annotation.tailrec
    def tail(num: Int, reversed: Long): Long = num match {
      case 0 => reversed
      case _ => tail(num / 10, reversed * 10 + (num % 10))
    }

    val res = tail(x, 0)
    if (res > Int.MaxValue || res < Int.MinValue) 0
    else res.toInt
  }
}
