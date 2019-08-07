package findAllAnagramsInAString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ids = new ArrayList<>();

        int[] patternArr = new int[26];
        for (int i = 0; i < p.length(); i++) {
            patternArr[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] currArr = new int[26];
            for (int j = 0; j < p.length(); j++) {
                currArr[s.charAt(i+j) - 'a']++;
            }

            boolean isAnagram = true;
            for (int j = 0; j < currArr.length; j++) {
                if (currArr[j] != patternArr[j]) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) ids.add(i);
        }
        return ids;
    }


    // second way with sort
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> ids = new ArrayList<>();
        String sorted = sortString(p);

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            String o = s.substring(i, i + p.length());
            if (sorted.equals(sortString(o))) {
                ids.add(i);
            }
        }
        return ids;
    }

    private String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
