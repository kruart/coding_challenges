package reverseLinkedList;

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode node = head;

        while (node != null) {
            ListNode temp = newHead;
            newHead = new ListNode(node.val);
            newHead.next = temp;
            node = node.next;
        }
        return newHead;
    }

    // for compilation
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
