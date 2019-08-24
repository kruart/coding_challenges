package addTwoNumbers2;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/add-two-numbers-ii/
public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();

        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int sum = carry;

            if (!stack1.isEmpty()) sum += stack1.pop();
            if (!stack2.isEmpty()) sum += stack2.pop();

            int lastDigit = sum % 10;
            ListNode temp = head;
            head = new ListNode(lastDigit);
            head.next = temp;
            carry = sum / 10;
        }
        return head;
    }

    // for local compilation
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
