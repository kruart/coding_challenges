package addTwoNumbers;

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int lastDigit = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(lastDigit);
            curr = curr.next;
        }
        return head.next;
    }

    // for compilation
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }
}
