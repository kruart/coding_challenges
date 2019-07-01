package data_structures.ArrayManipulation

// https://www.hackerrank.com/challenges/crush/problem
object ArrayManipulationS extends App {
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val arr = Array.fill(n+2)(0L)

    queries.foreach { q =>
      arr(q(0)) += q(2)
      arr(q(1)+1) -= q(2)
    }

    arr.foldLeft((0L, 0L))((sm, v) => {
      val sum = sm._1 + v // sm - (sum, max)
      (sum, Math.max(sum, sm._2))
    })._2 // return max
  }

  val readAndSplit = () => scala.io.StdIn.readLine().split(" ")
  val Array(n, m) = readAndSplit().map(_.trim.toInt)
  val queries = Array.ofDim[Int](m, 3)

  for (i <- 0 until m) {
    queries(i) = readAndSplit().map(_.trim.toInt)
  }

  val result = arrayManipulation(n, queries)
  println(result)
}