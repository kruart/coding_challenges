package algorithms.AngryProfessor

// https://www.hackerrank.com/challenges/angry-professor/problem
object AngryProfessorSc extends App {
  def angryProfessor(k: Int, a: Array[Int]): String = {
    if (k > a.count(_ <= 0)) "YES" else "NO"
  }

  println(angryProfessor(3, Array(-1, -3, 4, 2))) //YES
  println(angryProfessor(2, Array(0, -1, 2, 1)))  //NO
}
