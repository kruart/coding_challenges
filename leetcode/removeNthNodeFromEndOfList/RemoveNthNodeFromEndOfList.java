package removeNthNodeFromEndOfList;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // two pointers
        ListNode newHead = new ListNode(-1);
        ListNode slow = newHead;
        slow.next = head;
        ListNode faster = head;

        for (int i = 0; i < n; i++) {
            faster = faster.next;
        }

        while (faster != null) {
            slow = slow.next;
            faster = faster.next;
        }

        slow.next = slow.next.next;
        return newHead.next;
    }

    // for local compilation
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
