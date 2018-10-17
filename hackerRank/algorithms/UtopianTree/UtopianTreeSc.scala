package algorithms.UtopianTree

// https://www.hackerrank.com/challenges/utopian-tree/problem
object UtopianTreeSc extends App {
  def utopianTree(n: Int): Int = {
    (1 to n).foldLeft(1) {(acc, i) => if (i % 2 == 0) acc + 1 else acc * 2}
  }
  println(utopianTree(5)) //14
  println(utopianTree(0)) //1
  println(utopianTree(1)) //2
  println(utopianTree(4)) //7
}
