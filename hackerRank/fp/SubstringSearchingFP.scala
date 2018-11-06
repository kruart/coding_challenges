package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/kmp-fp/problem
object SubstringSearchingFP {
  def search(src: String, subStr:String): String = {
    val p = prefix(subStr)
    var k = 0 // number of occurrences

    for (i <- 0 until src.length) {
      while (k > 0 && subStr(k) != src(i)) {
        k = p(k - 1)
      }

      if (src(i) == subStr(k)) {
        k += 1 // occurrences found
      }

      // if we found entire substr in source string
      if (k == subStr.length) {
        return "YES"
      }
    }
    "NO"
  }

  def prefix(s: Seq[Any]): Array[Int]  = {
    val p = Array.fill(s.size)(0)

    for (i <- 1 until s.size) {
      var length = p(i - 1) // length of previous prefix

      while (length > 0 && s(i) != s(length)) {
        length = p(length - 1)
      }
      if (s(length) == s(i)) length += 1
      p(i) = length
    }
    p
  }

  def main(arr : Array[String]): Unit = {
    (1 to StdIn.readInt()).foreach(_ => {
      println(search(StdIn.readLine(), StdIn.readLine()))
    })
  }
}
