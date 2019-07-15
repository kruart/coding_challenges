package algorithms.BeautifulTriplets

// https://www.hackerrank.com/challenges/beautiful-triplets/problem
object BeautifulTripletsS extends App {
  def beautifulTriplets(d: Int, arr: Array[Int]): Int = {
    arr.count{ it => arr.contains(it+d) && arr.contains(it+d*2)}
  }

  val stdin = () => scala.io.StdIn.readLine.split(" ").map(_.trim.toInt)
  val Array(n, d) = stdin()
  println(beautifulTriplets(d, stdin()))
}