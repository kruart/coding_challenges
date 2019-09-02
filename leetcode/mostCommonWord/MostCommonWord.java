package mostCommonWord;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/most-common-word/
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> m = new HashMap<>();

        for (String word : paragraph.toLowerCase().split("[\\W_]+")) {
            if (m.containsKey(word)) m.put(word, m.get(word) + 1);
            else m.put(word, 1);
        }

        for (String bannedWord : banned) {
            m.remove(bannedWord);
        }

        int count = 0;
        String ans = "";
        for (String s : m.keySet()) {
            if (m.get(s) > count) {
                count = m.get(s);
                ans = s;
            }
        }
        return ans;
    }
}
