package sortCharactersByFrequency;

import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/sort-characters-by-frequency/
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Pair> m = new TreeMap<>();

        for (char c : s.toCharArray()) {
            if (!m.containsKey(c)) {
                m.put(c, new Pair(1, c));
            } else {
                m.get(c).count++;
            }
        }

        TreeSet<Pair> sorted = new TreeSet<>(m.values());
        StringBuilder sb = new StringBuilder();

        for (Pair pair : sorted) {
            int i = 0;
            while (i < pair.count) {
                sb.append(pair.letter);
                i++;
            }
        }
        return sb.toString();
    }

    static class Pair implements Comparable<Pair> {
        Integer count;
        Character letter;

        public Pair(int count, char letter) {
            this.count = count;
            this.letter = letter;
        }

        @Override
        public int compareTo(Pair other) {
            int result = other.count - count;
            return result != 0 ? result : Character.compare(letter, other.letter);
        }
    }
}
