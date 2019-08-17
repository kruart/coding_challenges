package addBinary;

// https://leetcode.com/problems/add-binary/
public class AddBinary {
    public String addBinary(String a, String b) {
//        return Integer.toBinaryString(Integer.parseInt("11", 2) + Integer.parseInt("1",2));

        StringBuilder sb = new StringBuilder();
        int len1 = a.length()-1;
        int len2 = b.length()-1;
        int carry = 0;

        while (len1 >= 0 || len2 >= 0 || carry != 0) {
            int sum = carry;

            if (len1 >= 0) {
                sum += a.charAt(len1) - '0';
                len1--;
            }

            if (len2 >= 0) {
                sum += b.charAt(len2) - '0';
                len2--;
            }

            int lastDigit = sum % 2;
            sb.append(lastDigit);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary b = new AddBinary();
        System.out.println(b.addBinary("1010", "1011"));
    }
}
