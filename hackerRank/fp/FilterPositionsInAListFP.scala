package fp

// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem
object FilterPositionsInAListFP extends App {
  def f(arr:List[Int]):List[Int] =  for (i <- arr.indices.toList if i % 2 != 0) yield arr(i)

  println(f(List(2, 5, 3, 4, 6, 7, 9, 8)))
}
