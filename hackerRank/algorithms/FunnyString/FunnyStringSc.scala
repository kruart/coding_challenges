package algorithms.FunnyString

import scala.io.StdIn
import scala.math.abs

// https://www.hackerrank.com/challenges/funny-string/problem
object FunnyStringSc extends App {
  def funnyString(s: String): String = {
    val res = (1 until s.length).forall {i =>
      abs(s(i) - s(i - 1)) == abs(s(s.length-i) - s(s.length-i-1))
    }
    if (res) "Funny" else "Not Funny"
  }

  (1 to StdIn.readInt).foreach{ _ => println(funnyString(StdIn.readLine)) }
}
