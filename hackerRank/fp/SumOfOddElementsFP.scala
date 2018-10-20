package fp

// https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem
object SumOfOddElementsFP extends App {
  def f(arr:List[Int]):Int = arr.filter(_ % 2 != 0).sum

  println(f(List(3, 2, 4, 6, 5, 7, 8, 0, 1)))
}
