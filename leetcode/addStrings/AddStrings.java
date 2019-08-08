package addStrings;

// https://leetcode.com/problems/add-strings/
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;

        int rest = 0;
        StringBuilder sb = new StringBuilder();
        while (len1 >= 0 || len2 >= 0 || rest != 0) {
            int sum = rest;

            if (len1 >= 0) {
                sum += num1.charAt(len1) - '0';
                len1--;
            }

            if (len2 >= 0) {
                sum += num2.charAt(len2) - '0';
                len2--;
            }

            int lastDigit = sum % 10;
            sb.append(lastDigit);
            rest = sum / 10;
        }
        return sb.reverse().toString();
    }
}
