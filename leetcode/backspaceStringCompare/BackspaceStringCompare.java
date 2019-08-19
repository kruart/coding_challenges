package backspaceStringCompare;

import java.util.Stack;

// https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (ch == '#') {
                if (!s1.isEmpty()) s1.pop();
            } else s1.push(ch);
        }

        for (char ch : T.toCharArray()) {
            if (ch == '#') {
                if (!s2.isEmpty()) s2.pop();
            } else s2.push(ch);
        }
        return s1.equals(s2);
    }
}
