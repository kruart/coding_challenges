package addStrings

// https://leetcode.com/problems/add-strings/
object AddStringsS {
  def addStrings(num1: String, num2: String): String = {
    var len1 = num1.length-1
    var len2 = num2.length-1
    val sb = new StringBuilder()

    var carry = 0
    while (len1 >= 0 || len2 >= 0 || carry != 0) {
      var sum = carry

      if (len1 >= 0) {
        sum += num1(len1).asDigit
        len1 -= 1
      }

      if (len2 >= 0) {
        sum += num2(len2).asDigit
        len2 -= 1
      }

      val lastDigit = sum % 10
      carry = sum / 10
      sb.append(lastDigit)
    }
    sb.reverse.toString
  }

  def main(args: Array[String]): Unit = {
    println(addStrings("43", "97"))
  }
}
