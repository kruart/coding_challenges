package customSortString;

// https://leetcode.com/problems/custom-sort-string/
public class CustomSortString {
    public String customSortString(String S, String T) {
        int[] letters = new int[26];

        for (char ch : T.toCharArray()) {
            letters[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : S.toCharArray()) {
            int num = letters[ch - 'a'];
            letters[ch - 'a'] = -1;
            for (int i = 0; i < num; i++) {
                sb.append(ch);
            }
        }

        for (char ch : T.toCharArray()) {
            if (letters[ch - 'a'] > 0) sb.append(ch);
        }
        return sb.toString();
    }
}
