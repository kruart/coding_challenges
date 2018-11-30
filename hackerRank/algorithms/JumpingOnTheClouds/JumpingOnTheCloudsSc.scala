package algorithms.JumpingOnTheClouds

import scala.annotation.tailrec

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
object JumpingOnTheCloudsSc {
  //way 1 (use tail recursion)
  def jumpingOnClouds(clouds: Array[Int]): Int = {
    @tailrec
    def tail_jump(arr: List[Int], count: Int): Int = arr match {
      case Nil | _ :: Nil => count  //if size 0 or 1
      case t if t.head == 0 => tail_jump(t.drop(2), count + 1)
      case _ => tail_jump(arr.tail, count + 1)
    }
    tail_jump(clouds.toList, 0)
  }
  //way 2 (use while)
  def jumpingOnClouds2(clouds: Array[Int]): Int = {
    var jumps = 1
    var cloudNum = 2
    while (cloudNum < clouds.length - 1) {
      if (clouds(cloudNum) != 0) cloudNum -= 1
      jumps += 1
      cloudNum += 2
    }
    jumps
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val (_, arr) = (stdin.readLine, stdin.readLine.split(" ").map(_.trim.toInt))
    val result = jumpingOnClouds(arr)
    println(result)
  }
}
