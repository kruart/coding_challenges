package validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> m = new HashMap<>();
        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');

        for (char ch : s.toCharArray()) {
            if (m.containsKey(ch)) {
                if (m.get(ch) == stack.peek()) stack.pop();
                else return false;
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
