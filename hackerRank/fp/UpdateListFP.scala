package fp

// https://www.hackerrank.com/challenges/fp-update-list/problem
object UpdateListFP extends App {
  def f(arr:List[Int]):List[Int] = {
    arr.map(math.abs)
  }

  println(f(List(2, -4, 3, -1, 23, -4, -54)))   //2, 4, 3, 1, 23, 4, 54
}
