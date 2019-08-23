package partitionList;

import nextGreaterNodeInLinkedList.NextGreaterNodeInLinkedList;

// https://leetcode.com/problems/partition-list/
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode lessHead = less;
        ListNode greater = new ListNode(-1); // >=
        ListNode greaterHead = greater;

        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }
        greater.next = null;
        less.next = greaterHead.next;
        return lessHead.next;
    }

    // for local compilation
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
