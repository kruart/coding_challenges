package relativeSortArray

object RelativeSortArrayS {
  def relativeSortArray(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    val groupedMap = arr1.groupBy(identity).mapValues(_.length)
    val firstPart = arr2.flatMap(i => Array.fill(groupedMap(i))(i))
    firstPart ++ arr1.filterNot(arr2.contains(_)).sorted
  }
}
