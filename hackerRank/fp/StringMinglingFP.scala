package fp

// https://www.hackerrank.com/challenges/string-mingling/problem
object StringMinglingFP {
  def mingle(s1: String, s2: String): String = {
    s1.zip(s2).flatten {case (a,b) => List(a,b)}.mkString("")
  }

  def main(args: Array[String]) {
    val f = () => scala.io.StdIn.readLine
    println(mingle(f(), f()))
  }
}
