package algorithms.PlusMinus

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

// https://www.hackerrank.com/challenges/plus-minus/problem
object PlusMinusSc {
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

  def main(args: Array[String]): Unit = {
    val (_, arr) =
      (StdIn.readInt(), StdIn.readLine().split(" ").map(_.trim.toInt))
    plusMinus(arr)
  }
}
