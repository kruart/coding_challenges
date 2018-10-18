package data_structures.LeftRotation

// https://www.hackerrank.com/challenges/array-left-rotation/problem
object LeftRotationSc {
    def main(args: Array[String]) {
      val stdin = scala.io.StdIn
      val nd = stdin.readLine.split(" ")
      val n = nd(0).trim.toInt
      val d = nd(1).trim.toInt
      val a = stdin.readLine.split(" ").map(_.trim.toInt)
      println(leftRotation(d, a).mkString(" "))

  }

  def leftRotation(times: Int, arr: Array[Int]): Array[Int] = {
    arr.takeRight(arr.length - times) ++ arr.take(times)
  }
}
