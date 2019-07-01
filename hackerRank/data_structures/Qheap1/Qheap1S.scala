package data_structures.Qheap1

import java.util.{PriorityQueue, Scanner}

// https://www.hackerrank.com/challenges/qheap1/problem
object Qheap1S extends App {
  val sc = new Scanner(System.in)
  var q = sc.nextInt
  val qq = new PriorityQueue[Integer](q)

  (0 until q).foreach { _ =>
    val v1 = sc.nextInt
    if (v1 == 1) qq.add(sc.nextInt)
    else if (v1 == 2) qq.remove(sc.nextInt)
    else if (v1 == 3) System.out.println(qq.peek)
  }

}
