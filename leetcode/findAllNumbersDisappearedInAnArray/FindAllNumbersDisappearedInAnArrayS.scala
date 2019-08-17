package findAllNumbersDisappearedInAnArray

import scala.collection.mutable.ListBuffer

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
object FindAllNumbersDisappearedInAnArrayS {
  def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
    //first way
    //    (1 to nums.length).toSet.diff(nums.toSet).toList

    // second way
    nums.foreach{ it =>
      val i = Math.abs(it) - 1
      if (nums(i) > 0) nums(i) = -nums(i)
    }

    var l = ListBuffer[Int]()
    for (i <- nums.indices) {
      if (nums(i) > 0) l += i+1
    }
    l.toList
  }
}
