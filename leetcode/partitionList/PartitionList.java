package partitionList;

import nextGreaterNodeInLinkedList.NextGreaterNodeInLinkedList;

// https://leetcode.com/problems/partition-list/
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode ltHead = new ListNode(-1);
        ListNode lt = ltHead;
        ListNode geHead = new ListNode(-1);
        ListNode ge = geHead; // >=

        while (head != null) {
            if (head.val < x) {
                lt.next = new ListNode(head.val);
                lt = lt.next;
            } else {
                ge.next = new ListNode(head.val);
                ge = ge.next;
            }
            head = head.next;
        }
        lt.next = geHead.next;
        return ltHead.next;
    }

    // for local compilation
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
