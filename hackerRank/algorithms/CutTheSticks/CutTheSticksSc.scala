package algorithms.CutTheSticks

import scala.collection.mutable.ArrayBuffer

// https://www.hackerrank.com/challenges/cut-the-sticks/problem
object CutTheSticksSc {
  def cutTheSticks(arr: Array[Int]): Array[Int] = {
    val mArr = ArrayBuffer(arr.sorted: _*)
    var sticks = ArrayBuffer(mArr.size)

    (1 until mArr.length).foreach(i => {
      if (mArr(i-1) != mArr(i)) sticks += mArr.length - i
    })
    sticks.to[Array]
  }

  def main(args: Array[String]): Unit = {
    println(cutTheSticks(Array(1, 2, 3)).mkString(" "))                 //3 2 1
    println(cutTheSticks(Array(5, 4, 4, 2, 2, 8)).mkString(" "))        //6 4 2 1
    println(cutTheSticks(Array(1, 2, 3, 4, 3, 3, 2, 1)).mkString(" "))  //8 6 4 1
  }
}
