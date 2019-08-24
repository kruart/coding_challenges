package minimumAddToMakeParenthesesValid;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int count = 0;
        int open = 0;

        for (char c : S.toCharArray()) {
            if (c == ')') {
                if (open > 0) open--;
                else count++;
            } else {
                open++;
            }
        }
        return count + open;
    }

    // less efficient way, solution with stack,
    public int minAddToMakeValid2(String S) {
        Deque<Character> stack = new LinkedList<>();
        int count = 0;

        for (char c : S.toCharArray()) {
            if (c == ')') {
                if (!stack.isEmpty()) stack.pop();
                else count++;
            } else {
                stack.push(c);
            }
        }
        return stack.size() + count;
    }
}
