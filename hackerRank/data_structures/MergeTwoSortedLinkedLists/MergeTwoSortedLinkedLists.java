package data_structures.MergeTwoSortedLinkedLists;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
public class MergeTwoSortedLinkedLists {
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
                System.out.println(sep);
            }
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList ll = new SinglyLinkedList();

        while (head1 != null || head2 != null) {
            if (head1 == null) {
                ll.insertNode(head2.data);
                head2 = head2.next;
            } else if (head2 == null) {
                ll.insertNode(head1.data);
                head1 = head1.next;
            } else if (head1.data < head2.data) {
                ll.insertNode(head1.data);
                head1 = head1.next;
            } else {
                ll.insertNode(head2.data);
                head2 = head2.next;
            }
        }
        return ll.head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
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

            SinglyLinkedListNode ll3 = mergeLists(ll1.head, ll2.head);
            printSinglyLinkedList(ll3, " ");
        }
        scanner.close();
    }
}
