package reverseLinkedList2;

// https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode prev = start;
        int idx = 1;

        while (idx < m) {
            prev = prev.next;
            head = head.next;
            idx++;
        }
        prev.next = reverse(head, idx, n);
        return start.next;
    }

    private ListNode reverse(ListNode head, int idx, int n) {
        ListNode rev = null;
        ListNode first = head;

        while (head != null && idx <= n) {
            ListNode temp = head.next;
            head.next = rev;
            rev = head;
            head = temp;
            idx++;
        }
        first.next = head;
        return rev;
    }


    // for compilation purposes
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
