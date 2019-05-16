package algorithms.SherlockAndAnagrams

import scala.io.StdIn

// https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
object SherlockAndAnagramsS extends App {
  (1 to StdIn.readInt()).foreach(_ => println(sherlockAndAnagrams(StdIn.readLine)))

  def sherlockAndAnagrams(s: String): Int = {
    val m = collection.mutable.Map[String, Int]()
    var count = 0
    (1 until s.length).foreach { i =>
      (0 until s.length).foreach { j =>
        val subStr = s.slice(j, j + i).sorted

        if (subStr.length == i && m.contains(subStr)) {
            val v = m(subStr)
            m.update(subStr, v + 1)
            count += v
          }
          else if (subStr.length == i) m += (subStr -> 1)
      }
    }
    count
  }
}
