package twoSum

object TwoSumS {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var m = collection.mutable.Map[Int, Int]()

    nums.indices.foreach { i =>
      val diff = target - nums(i)
      if (m.contains(diff)) return Array(m(diff), i)
      m += (nums(i) -> i)
    }
    Array()
  }
}
