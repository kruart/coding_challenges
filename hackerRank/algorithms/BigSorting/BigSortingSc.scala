package algorithms.BigSorting

import scala.io.Source

// https://www.hackerrank.com/challenges/big-sorting/problem
object BigSortingSc {
  def bigSorting(unsorted: Array[String]): Array[String] = {
    unsorted.sortWith((s1, s2) => {
      if (s1.length == s2.length) s1.compareTo(s2) < 0
      else s1.length - s2.length < 0
    })
  }

  def main(args: Array[String]): Unit = {
    val unsorted = Source.stdin.getLines().drop(1).toArray
    println(bigSorting(unsorted).mkString("\n"))
  }
}