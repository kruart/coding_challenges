package validAnagram

// https://leetcode.com/problems/valid-anagram/
object ValidAnagramS {
  def isAnagram(s: String, t: String): Boolean = {
    if (s.length != t.length) return false
    val m = scala.collection.mutable.Map[Char, Int]().withDefaultValue(0)

    for (i <- s.indices) {
      m(s(i)) += 1
      m(t(i)) -= 1
    }

    m.values.forall(_ == 0)
  }

  def isAnagram2(s: String, t: String): Boolean = {
    s.sorted == t.sorted
  }
}
