package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/string-compression/problem
object StringCompressionFP extends App {
  //way 1 foldLeft
  def compress1(word: String): String = {
    word.foldLeft(List.empty[(Char, Int)]) { (acc, e) =>
      acc match {
        case Nil => (e, 1) :: Nil
        case (`e`, lastCharCount) :: xs => (e, lastCharCount + 1) :: xs
        case xs => (e, 1) :: xs
      }
    }.reverse.map { case (a, num) => s"$a${if (num > 1) num else ""}" }.foldLeft("")(_ ++ _)
  }

  //way 2 foldRight
  def compress2(word: String): String =
    word.map((_, 1)).foldRight(List.empty[(Char, Int)]) { (e, acc) =>
      acc match {
        case Nil => List(e)
        // (head elem)::rest list => if (head.c==e._1) update tuple else add new tuple to list
        case (c, i) :: rest => if (c == e._1) (c, i + 1) :: rest else e :: acc
      }
    }.map {case (a, num) => s"$a${if (num > 1) num else ""}" }.mkString("")

  //way 3 regEx
  def compress3(word: String): String =
    "(\\w)\\1+".r.replaceAllIn(word, m => "$1" + m.toString.length)

  //aaabaaaaccaaaaba  ==  a3ba4c2a4ba
  println(compress1(StdIn.readLine()))
  println(compress2(StdIn.readLine()))
  println(compress3(StdIn.readLine()))
}
