package data_structures.Array2DDS

//https://www.hackerrank.com/challenges/2d-array/problem
object Array2D_DS_Sc extends App {

  def hourglassSum(arr: Array[Array[Int]]): Int = {
    var maxSum = Int.MinValue

    for (i <- 0 until arr.length - 2) {
      for (j <- 0 until arr.length - 2) {
        val tempSum = arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) + arr(i+1)(j+1) + arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)
        if (maxSum < tempSum) maxSum = tempSum
      }
    }
    maxSum
  }


  val arr: Array[Array[Int]] = Array[Array[Int]](
    Array(1, 1, 1, 0, 0, 0),
    Array(0, 1, 0, 0, 0, 0),
    Array(1, 1, 1, 0, 0, 0),
    Array(0, 0, 2, 4, 4, 0),
    Array(0, 0, 0, 2, 0, 0),
    Array(0, 0, 1, 2, 4, 0))

  val arr1: Array[Array[Int]] = Array[Array[Int]](
    Array(1, 1, 1, 0, 0, 0),
    Array(0, 1, 0, 0, 0, 0),
    Array(1, 1, 1, 0, 0, 0),
    Array(0, 9, 2, -4, -4, 0),
    Array(0, 0, 0, -2, 0, 0),
    Array(0, 0, -1, -2, -4, 0))

  val arr2: Array[Array[Int]] = Array[Array[Int]](
    Array(1, 1, 1, 0, 0, 7),
    Array(0, 1, 0, 0, 5, 0),
    Array(1, 1, 1, 0, 8, 0),
    Array(0, 9, 2, 9, 4, 0),
    Array(0, 0, 0, -2, 8, 0),
    Array(0, 0, -1, 2, 7, 7))

  val arr3: Array[Array[Int]] = Array[Array[Int]](
    Array(0, -4, -6, 0, -7, -6),
    Array(-1, -2, -6, -8, -3, -1),
    Array(-8, -4, -2, -8, -8, -6),
    Array(-3, -1, -2, -5, -7, -4),
    Array(-3, -5, -3, -6, -6, -6),
    Array(-3, -6, 0, -8, -6, -7))

  println(hourglassSum(arr)) //19
  println(hourglassSum(arr1)) //13
  println(hourglassSum(arr2)) //37
  println(hourglassSum(arr3)) //-19

}
