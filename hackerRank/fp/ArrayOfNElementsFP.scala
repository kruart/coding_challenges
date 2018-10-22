package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/fp-array-of-n-elements/problem
object ArrayOfNElementsFP extends App {
  def f(num:Int) :List[Int] = List.range(0, num)

  println(f(StdIn.readInt()))
}
