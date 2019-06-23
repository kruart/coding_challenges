package sortings.quicksort

object QuickSortS extends App {
  def quickSort(l: List[Int]): List[Int] = {
    if (l.size <= 1) return l
    val parts = l.init.partition { _ < l.last } // l.last is pivot
    (quickSort(parts._1) :+ l.last) ++ quickSort(parts._2)
  }

  println(quickSort(List(5, 9, 6, 4, 10, 7, 1, 8, 3, 2)))
  println(quickSort(List(0, 9, 6, 0, 10, -10, 1, 8, 3, 0)))
  println(quickSort(List(2, -3, 0, -4, 3, 5, -2, 1, 4, -1, -5)))
}
