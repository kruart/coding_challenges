package fp

// https://www.hackerrank.com/challenges/fp-list-length/problem
object ListLengthFP extends App {
  def f(arr:List[Int]):Int = arr.foldLeft(0)((acc, _) => acc + 1)

  print(f(List(11, 22, 33, 44, 55)))
}
