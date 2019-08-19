package validPalindrome;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String replaced = s.replaceAll("[\\W_ ]", "").toLowerCase();

        // return replaced.equals(new StringBuilder(replaced).reverse().toString());
        for (int i = 0; i < replaced.length() / 2; i++) {
            if (replaced.charAt(i) != replaced.charAt(replaced.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
