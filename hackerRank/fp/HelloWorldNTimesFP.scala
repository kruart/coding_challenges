package fp

// https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem
object HelloWorldNTimesFP extends App {
  var n = scala.io.StdIn.readInt
  f(n)

  def f(n: Int): Unit = {
    (0 until n).foreach(_ => println("Hello World"))
  }
}
