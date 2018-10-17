package data_structures.MaximumElement

import java.util.Scanner

import scala.collection.mutable

// https://www.hackerrank.com/challenges/maximum-element/problem
object Solution {
  val sc: Scanner  = new Scanner(System.in)
  var max: Int = Int.MinValue

  def main(args: Array[String]) {
    val stack = mutable.ArrayStack[Int]()

    val n = sc.nextInt()
    for (i <- 0 until n) {
      val firstParam = sc.nextInt()
      doAction(firstParam, stack)
    }
    sc.close()
  }

  def doAction(num: Int, stack: mutable.ArrayStack[Int]): Unit = num match {
    case 1 => {                 //add elem to the end
      val value = sc.nextInt()
      max = scala.math.max(max, value)
      stack += value
    }
    case 2 => {                 //remove elem at the top
      val remValue = if (stack.nonEmpty) stack.pop()
      if (max == remValue && stack.nonEmpty)
        max = stack.max
      else if (stack.isEmpty)
        max = Int.MinValue
    }
    case 3 => println(max)      //print max elem in the stack
  }
}
