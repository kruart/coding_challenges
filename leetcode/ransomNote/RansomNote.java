package ransomNote;

import java.util.Arrays;

// https://leetcode.com/problems/ransom-note/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            if (i < ransomNote.length())
                arr[ransomNote.charAt(i) - 'a']++;

            arr[magazine.charAt(i) - 'a']--;
        }
        return Arrays.stream(arr).allMatch(i -> i <= 0);
    }
}
