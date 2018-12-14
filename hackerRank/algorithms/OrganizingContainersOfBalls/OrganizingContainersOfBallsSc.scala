package algorithms.OrganizingContainersOfBalls

// https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem
object OrganizingContainersOfBallsSc {
  def organizingContainers(container: Array[Array[Int]]): String = {
    val rowSum = container.map(_.sum).sorted
    val colSum = container.transpose.map(_.sum).sorted
    if (rowSum sameElements colSum) "Possible" else "Impossible"
  }

  def main(args: Array[String]) {
    val stdin = () => scala.io.StdIn.readLine

    val q = stdin().trim.toInt

    for (_ <- 1 to q) {
      val n = stdin().trim.toInt
      val container = Array.ofDim[Int](n, n)
      for (i <- 0 until n) {
        container(i) = stdin().split(" ").map(_.trim.toInt)
      }

      val result = organizingContainers(container)
      println(result)
    }
  }
}
