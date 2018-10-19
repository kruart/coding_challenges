package fp

// https://www.hackerrank.com/challenges/fp-reverse-a-list/problem
object ReverseAListFP extends App {
  def f(arr:List[Int]):List[Int] =
    (for (i <- arr.size-1 to 0 by -1) yield arr(i)).toList

  println(f(List(1, 2, 3, 4, 5, 6, 7)))
}
