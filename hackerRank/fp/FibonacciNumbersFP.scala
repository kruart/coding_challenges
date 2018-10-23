package fp

// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers/problem
object FibonacciNumbersFP extends App {
  def fibonacci(x:Int):Int = x match {
    case 1 => 0
    case 2 => 1
    case _ => fibonacci(x - 1) + fibonacci(x - 2)
  }

  println(fibonacci(3)) //1
}
