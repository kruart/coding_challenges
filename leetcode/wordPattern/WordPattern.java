package wordPattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/word-pattern/
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> m = new HashMap<>();
        Set<String> s = new HashSet<>();
        String[] words = str.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (m.containsKey(ch)) {
                if (!m.get(ch).equals(word)) {
                    return false;
                }
            } else if (s.contains(word)) {
                return false;
            }
            m.put(ch, word);
            s.add(word);
        }
        return true;
    }
}
