package palindromeNumber

// https://leetcode.com/problems/palindrome-number/
object PalindromeNumberS {
  def isPalindrome(x: Int): Boolean = {
    val s = x.toString
    (0 until s.length / 2).forall(i => s(i) == s(s.length - i - 1))
  }
}
