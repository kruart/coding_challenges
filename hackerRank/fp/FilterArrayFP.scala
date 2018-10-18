package fp

// https://www.hackerrank.com/challenges/fp-filter-array/problem
object FilterArrayFP extends App {
  def f(delim:Int,arr:List[Int]):List[Int] = {
      arr.filter(_ < delim)
  }

  f(3, List(10, 9, 8, 2, 7, 5, 1, 3, 0)).foreach(println) //2 1 0
}
