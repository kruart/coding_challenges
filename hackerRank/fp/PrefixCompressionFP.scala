package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/prefix-compression/problem
object PrefixCompressionFP {
  def prefixCompression(a: String, b: String): Unit = {
    val maxPrefix = math.min(a.length, b.length)
    val prefixLn = (0 until maxPrefix).prefixLength(i => a(i)==b(i))
    val x = a.drop(prefixLn)
    val y = b.drop(prefixLn)

    println(s"$prefixLn ${a.take(prefixLn)}")
    println(s"${x.length} $x")
    println(s"${y.length} $y")
  }

  def main(args: Array[String]) {
    prefixCompression(StdIn.readLine(), StdIn.readLine())
  }
}
