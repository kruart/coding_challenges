package jewelsAndStones;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> s = new HashSet<>();

        for (char c : J.toCharArray()) {
            s.add(c);
        }

        int count = 0;

        for (char c : S.toCharArray()) {
            if (s.contains(c)) count++;
        }
        return count;
    }
}
