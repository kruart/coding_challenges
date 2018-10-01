package java_;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/java-stack/problem
public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
    }

    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if (stack.isEmpty())
                return false;
            else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']') || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
