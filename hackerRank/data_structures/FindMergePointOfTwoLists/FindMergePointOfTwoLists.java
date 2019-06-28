package data_structures.FindMergePointOfTwoLists;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
public class FindMergePointOfTwoLists {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Set<SinglyLinkedListNode> nums = new HashSet<>();

        while (head1 != null) {
            nums.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (nums.contains(head2)) {
                return head2.data;
            }
            head2 = head2.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int index = scanner.nextInt();
            SinglyLinkedList ll1 = new SinglyLinkedList();
            int n1 = scanner.nextInt();

            for (int i = 0; i < n1; i++) {
                int item = scanner.nextInt();
                ll1.insertNode(item);
            }

            SinglyLinkedList ll2 = new SinglyLinkedList();
            int n2 = scanner.nextInt();

            for (int i = 0; i < n2; i++) {
                int item = scanner.nextInt();
                ll2.insertNode(item);
            }

            SinglyLinkedListNode ptr1 = ll1.head;
            SinglyLinkedListNode ptr2 = ll2.head;

            for (int i = 0; i < n1; i++) {
                if (i < index) {
                    ptr1 = ptr1.next;
                }
            }

            for (int i = 0; i < n2; i++) {
                if (i != n2-1) {
                    ptr2 = ptr2.next;
                }
            }

            ptr2.next = ptr1;

            int result = findMergeNode(ll1.head, ll2.head);
            System.out.println(result);
        }
        scanner.close();
    }
}