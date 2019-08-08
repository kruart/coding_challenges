package rotateString;

// https://leetcode.com/problems/rotate-string/
public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) return false;

        String shifted = A;
        int l = shifted.length();
        for (int i = 0; i < l; i++) {
            shifted = shifted.charAt(l-1) + shifted.substring(0, l-1);
            if (shifted.equals(B)) return true;
        }
        return A.isEmpty();
    }
}
