package longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();

        int max = 0;
        int lastIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (m.containsKey(ch) && m.get(ch) >= lastIdx) {
                lastIdx = m.get(ch) + 1;
            }
            m.put(ch, i);
            max = Math.max(max, i - lastIdx + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("tmmzuxt"));  //5
        System.out.println(l.lengthOfLongestSubstring("abba"));     //2
        System.out.println(l.lengthOfLongestSubstring("cdd"));      //2
        System.out.println(l.lengthOfLongestSubstring("pwwkew"));   //3
        System.out.println(l.lengthOfLongestSubstring("abcabcbb")); //3
        System.out.println(l.lengthOfLongestSubstring("bbbbb"));    //1
        System.out.println(l.lengthOfLongestSubstring("abcdf"));    //5
        System.out.println(l.lengthOfLongestSubstring("aab"));      //2
        System.out.println(l.lengthOfLongestSubstring(""));         //0
        System.out.println(l.lengthOfLongestSubstring(" "));        //1
    }
}
