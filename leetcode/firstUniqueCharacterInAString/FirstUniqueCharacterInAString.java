package firstUniqueCharacterInAString;

// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] letters = new int[26];

        char[] arr = s.toCharArray();
        for (char ch : arr) {
            letters[ch - 'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (letters[arr[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
