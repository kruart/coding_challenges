package romanToInteger

// https://leetcode.com/problems/roman-to-integer/
object RomanToIntegerS {
  def romanToInt(s: String): Int = {
    val m = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
    var arabicNum = m(s.last)

    s.init.indices.reverse.foreach { n =>
      if (m(s(n)) >= m(s(n+1)))
        arabicNum += m(s(n))
      else
        arabicNum -= m(s(n))
    }
    arabicNum
  }
}
