package findTheDifference;

// https://leetcode.com/problems/find-the-difference/
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int letterCode = 0;

        for (char ch : s.toCharArray()) {
            letterCode ^= ch;
        }

        for (char ch : t.toCharArray()) {
            letterCode ^= ch;
        }

        return (char)(letterCode);
    }
}
