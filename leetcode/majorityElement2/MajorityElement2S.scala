package majorityElement2

// https://leetcode.com/problems/majority-element-ii/submissions/
object MajorityElement2S {
  def majorityElement(nums: Array[Int]): List[Int] = {
    val m = nums.groupBy(identity).mapValues(_.length)
    m.keys.filter(k => m(k) > nums.length / 3).toList
  }
}
