package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon/problem
object ComputeThePerimeterOfAPolygonFP {
  def distance(a: IndexedSeq[Array[Double]]): Double =  a match {
    case l if l.length >= 2 => math.sqrt(math.pow(l(0)(0) - l(1)(0), 2) + math.pow(l(0)(1) - l(1)(1), 2)) + distance(l.drop(1))
    case _ => 0
  }

  def main(args: Array[String]) {
    val N = StdIn.readInt
    val points = (1 to N).take(N).map(_ => StdIn.readLine().split(" ").map(_.toDouble))
    println(distance(points :+ points.head ))
  }
}
