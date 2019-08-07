package reverseInteger

// https://leetcode.com/problems/reverse-integer/
object ReverseIntegerS extends App {
  def reverse(x: Int): Int = {
    def tail(num: Int, reversed: Long): Long = num match {
      case 0 => reversed
      case _ => tail(num / 10, reversed * 10 + (num % 10))
    }

    val res = tail(x, 0)
    if (res > Int.MaxValue || res < Int.MinValue) 0
    else res.toInt
  }

  // tests
  println(reverse(123))             //  321
  println(reverse(-123))            // -321
  println(reverse(120))             //   21
  println(reverse(Int.MaxValue))    //    0
  println(reverse(Int.MinValue))    //    0
}
