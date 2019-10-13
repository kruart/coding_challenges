package isSubsequence;

// https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;

        for (char ch : s.toCharArray()) {
            boolean isFind = false;

            while (idx < t.length()) {
                if (t.charAt(idx++) == ch) {
                    isFind = true;
                    break;
                }
            }
            if (!isFind) return false;
        }
        return true;
    }
}
