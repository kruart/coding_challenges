package reverseInteger;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }
        return reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE ? 0 : (int)reversed;
    }
}
