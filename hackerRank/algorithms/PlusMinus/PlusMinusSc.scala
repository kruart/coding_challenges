package algorithms.PlusMinus

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

// https://www.hackerrank.com/challenges/plus-minus/problem
object PlusMinusSc {
  //way 1
  def plusMinus(arr: Array[Int]) {
    arr.foldLeft(ArrayBuffer[Int](0, 0, 0)) { (acc, num) =>
        num match {
          case n if n > 0 => acc(0) += 1; acc
          case n if n < 0 => acc(1) += 1; acc
          case 0 => acc(2) += 1; acc
        }
      }
      .map(_.toFloat / arr.length)
      .foreach(println)
  }

  //way 2
  def plusMinus2(arr: Array[Int]) {
    val m = arr.groupBy(it => 1 + (it >> 31) - (-it >> 31)).mapValues(_.length)
    println((if (m.contains(2)) m(2).toFloat else 0) / arr.length)
    println((if (m.contains(0)) m(0).toFloat else 0) / arr.length)
    println((if (m.contains(1)) m(1).toFloat else 0) / arr.length)
  }

  def main(args: Array[String]): Unit = {
    val (_, arr) =
      (StdIn.readInt(), StdIn.readLine().split(" ").map(_.trim.toInt))
    plusMinus(arr)
  }
}
