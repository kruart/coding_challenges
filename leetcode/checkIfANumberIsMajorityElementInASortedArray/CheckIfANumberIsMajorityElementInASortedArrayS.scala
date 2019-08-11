package checkIfANumberIsMajorityElementInASortedArray

object CheckIfANumberIsMajorityElementInASortedArrayS {
  def isMajorityElement(nums: Array[Int], target: Int): Boolean = {
    nums.count(_ == target) > nums.length / 2
  }
}
