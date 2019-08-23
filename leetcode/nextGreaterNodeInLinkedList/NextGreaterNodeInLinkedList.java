package nextGreaterNodeInLinkedList;

import java.util.*;

// https://leetcode.com/problems/next-greater-node-in-linked-list/
public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        int size = 0;

        while (curr != null) {
            curr = curr.next;
            size++;  // count size of nodes
        }

        Deque<Integer> s = new LinkedList<>();
        int[] nodes = new int[size];
        int i = 0;

        while (head != null) {
            nodes[i] = head.val;
            while (!s.isEmpty() && nodes[s.peek()] < head.val) {
                nodes[s.pop()] = head.val;
            }
            s.push(i++);
            head = head.next;
        }

        while (!s.isEmpty()) nodes[s.pop()] = 0;
        return nodes;
    }

    // for local compilation
     static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
