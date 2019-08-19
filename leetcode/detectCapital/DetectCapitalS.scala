package detectCapital

// https://leetcode.com/problems/detect-capital/
object DetectCapitalS {
  def detectCapitalUse(word: String): Boolean = {
    val uppers = word.count(_.isUpper)
    uppers == word.length || uppers == 0 || uppers == 1 && word(0).isUpper
  }
}
