package algorithms.SaveThePrisoner

// https://www.hackerrank.com/challenges/save-the-prisoner/problem
object SaveThePrisonerSc {
  def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
    val k = (m - 1 + s) % n
    if (k == 0) n else k
  }

  def main(args: Array[String]): Unit = {
    println(saveThePrisoner(4, 6, 2))  // 3
    println(saveThePrisoner(5, 2, 1))  // 2
    println(saveThePrisoner(5, 2, 2))  // 3
    println(saveThePrisoner(7, 19, 2)) // 6
    println(saveThePrisoner(3, 7, 3))  // 3
    println(saveThePrisoner(5, 5, 1))  // 5
    println(saveThePrisoner(352926151, 380324688, 94730870))    // 122129406
    println(saveThePrisoner(94431605, 679262176, 5284458))      // 23525398
    println(saveThePrisoner(785405778, 835771758, 689182705))   // 739548684
    println(saveThePrisoner(999999999, 999999999, 1))           // 999999999
    println(saveThePrisoner(877625009, 999275937, 874127074))   // 118152992
  }
}
