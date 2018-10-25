package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem
object ComputingTheGCDFP {
  def gcd(x: Int, y: Int): Int = {
    if (x == 0) y else gcd(y%x, x)
  }


  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }

  def main(args: Array[String]) {
    acceptInputAndComputeGCD(StdIn.readLine().trim().split(" ").map(x=>x.toInt).toList)
  }
}
