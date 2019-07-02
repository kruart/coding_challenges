package fp

import scala.collection.mutable
import scala.io.StdIn

// https://www.hackerrank.com/challenges/missing-numbers-fp/problem
object MissingNumbersFP extends App {
  val (_, l1, _, l2) = (
    StdIn.readInt(),
    StdIn.readLine().split(" "),
    StdIn.readInt(),
    StdIn.readLine().split(" "),
  )

  // way 1
  l2.diff(l1).distinct.sorted.foreach(i => print(s"$i "))

  // way 2 just for fun
  val map = mutable.TreeMap[String, Int]().withDefaultValue(0)

  l2.foreach {i => map.update(i, map(i) + 1)}
  l1.foreach {i => if (map.contains(i)) map(i) -= 1}
  map.filter(_._2 > 0).keys.foreach(i => print(s"$i "))
}
