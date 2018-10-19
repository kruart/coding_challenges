package algorithms.ClimbingTheLeaderBoard

import util.control.Breaks.{break, breakable}

// https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
object ClimbingTheLeaderBoardSc extends App {
  def climbingLeaderboard(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val places = new Array[Int](alice.length)
    val distinctScores = scores.distinct

    var currentPlace = distinctScores.length
    for (i <- alice.indices) {
      breakable {
        for (j <- currentPlace - 1 to 0 by -1) {
          if (alice(i) >= distinctScores(j)) currentPlace -= 1
          else break
        }
      }
      places(i) = currentPlace+1
    }
    places
  }

  val result1: Array[Int] = climbingLeaderboard(Array(100, 90, 90, 80), Array(70, 80, 105)) //4 3 1
  val result2: Array[Int] = climbingLeaderboard(Array(100, 100, 50, 40, 40, 20, 10), Array(5, 25, 50, 120)) //6 4 2 1
  val result3: Array[Int] = climbingLeaderboard(Array(100, 90, 90, 80, 75, 60), Array(50, 65, 77, 90, 102)) //6 5 4 2 1

  println(result1.mkString(" "))
  println(result2.mkString(" "))
  println(result3.mkString(" "))
}
