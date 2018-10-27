package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem
object ComputeTheAreaOfAPolygonFP {
  def area(a: IndexedSeq[Array[Double]]): Double = {
    val result = (1 until a.length).foldLeft(0.0) {
      (acc, i) => acc + a(i-1)(0)*a(i)(1) - a(i)(0)*a(i-1)(1)
    }
    math.abs(result) / 2
  }

  def main(args: Array[String]) {
    val N = StdIn.readInt
    val points = (1 to N).take(N)
      .map(_ => StdIn.readLine().split(" ").map(_.toDouble))
    println(area(points :+ points.head ))
  }
}
