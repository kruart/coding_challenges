package algorithms.TheHurdleRace

// https://www.hackerrank.com/challenges/the-hurdle-race/problem
object TheHurdleRaceSc {
  // Complete the hurdleRace function below.
  def hurdleRace(k: Int, height: Array[Int]): Int = {
    if (k - height.max >= 0) 0 else height.max - k
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val nk = stdin.readLine.split(" ")

    val _ = nk(0).trim.toInt
    val k = nk(1).trim.toInt

    val height = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = hurdleRace(k, height)

    println(result)
  }
}
