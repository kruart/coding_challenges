package algorithms.JumpingOnTheCloudsRevisited

// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
object JumpingOnTheCloudsRevisitedSc {
  def jumpingOnClouds(c: Array[Int], k: Int): Int = {
    (c.indices by k).foldLeft(100)({(acc, v) => acc - c(v) * 2 - 1 })
  }

  def main(args: Array[String]): Unit = {
    println(jumpingOnClouds(Array(0, 0, 1, 0), 2))                        //96
    println(jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 1, 0), 2))            //92
    println(jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 1), 2))               //92
    println(jumpingOnClouds(Array(1, 1, 1, 0, 1, 1, 0, 0, 0, 0), 3))      //94

  }
}
