package licenseKeyFormatting;

// https://leetcode.com/problems/license-key-formatting/
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        String str = S.replaceAll("-", "");
        StringBuilder sb = new StringBuilder();
        int sLen = str.length()-1;
        int count = 0;

        while (sLen >= 0) {
            if (count == K) {
                count = 0;
                sb.append("-");
            }
            sb.append(Character.toUpperCase(str.charAt(sLen)));
            count++;
            sLen--;
        }
        return sb.reverse().toString();
    }
}
