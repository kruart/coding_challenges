package validateStackSequences;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/validate-stack-sequences/
public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
        int idxToPop = 0;

        for (int val : pushed) {
            stack.push(val);

            while(!stack.isEmpty() && stack.peek() == popped[idxToPop]) {
                stack.pop();
                idxToPop++;
            }
        }
        return stack.isEmpty();
    }
}
