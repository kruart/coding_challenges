package algorithms.FindDigits

// https://www.hackerrank.com/challenges/find-digits/problem
object FindDigitsSc extends App {

  def findDigits(n: Int): Int = {
    n.toString.split("").count(i => i.toInt != 0 && n % i.toInt == 0)
  }

  println(findDigits(12))   //2
  println(findDigits(1012)) //3
}
