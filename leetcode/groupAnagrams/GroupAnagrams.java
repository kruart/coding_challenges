package groupAnagrams;

import java.util.*;

// https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            if (!m.containsKey(sorted)) {
                m.put(sorted, new ArrayList<>());
            }
            m.get(sorted).add(str);
        }

        return new ArrayList<>(m.values());
    }
}
