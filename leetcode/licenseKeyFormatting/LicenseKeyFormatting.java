package licenseKeyFormatting;

// https://leetcode.com/problems/license-key-formatting/
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        String code = S.replaceAll("-", "");

        StringBuilder formattedCode = new StringBuilder();
        int count = 0;
        for (int i = code.length()-1; i >= 0; i--) {
            char ch = code.charAt(i);
            formattedCode.append(Character.toUpperCase(ch));
            count++;

            if (i != 0 && count % K == 0) {
                formattedCode.append("-");
                count = 0;
            }

        }
        return formattedCode.reverse().toString();
    }
}
