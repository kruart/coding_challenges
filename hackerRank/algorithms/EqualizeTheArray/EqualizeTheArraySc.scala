package algorithms.EqualizeTheArray

// https://www.hackerrank.com/challenges/equality-in-a-array/problem
object EqualizeTheArraySc extends App {
  def equalizeArray(arr: Array[Int]): Int = {
    arr.length - arr.groupBy(identity).map(_._2.length).max
  }

  println(equalizeArray(Array(3, 3, 2, 1, 3))) //2
}
