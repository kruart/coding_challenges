package fizzBuzz

// https://leetcode.com/problems/fizz-buzz/
object FizzBuzzS {
  def fizzBuzz(n: Int): List[String] = {
    (1 to n).map {
        case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz"
        case i if i % 3 == 0 => "Fizz"
        case i if i % 5 == 0 => "Buzz"
        case i => i.toString
    }.toList
  }

  def main(args: Array[String]): Unit = {
    println(fizzBuzz(15))
  }
}
