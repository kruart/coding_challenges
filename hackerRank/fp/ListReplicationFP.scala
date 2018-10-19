package fp

// https://www.hackerrank.com/challenges/fp-list-replication/problem
object ListReplicationFP extends App {
  def f(num:Int,arr:List[Int]):List[Int] = {
    arr.flatMap(List.fill(num)(_))
  }

  println(f(3, List(1, 2, 3, 4)))
}
