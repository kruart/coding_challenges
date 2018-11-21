package algorithms.TwoCharacters

import scala.io.StdIn

// https://www.hackerrank.com/challenges/two-characters/problem
object TwoCharactersSc {
  def alternate(s: String): Int = {
    s.distinct.combinations(2)
      .map(it => s.replaceAll(s"[^$it]", ""))
//      .filter(str => (2 until str.length).forall(it => str(it - 2) == str(it)))
      .filter(_.matches("^(.)((?!\\1).\\1)*(?!\\1).?$"))
      .map(_.length)
      .reduceOption(_ max _).getOrElse(0)
  }

  def main(args: Array[String]) {
    val (_, s: String) = (StdIn.readLine, StdIn.readLine)
    println(alternate(s))
  }
}
