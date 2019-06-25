package data_structures.CompareTwoLinkedLists;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
public class CompareTwoLinkedLists {

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

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;

        }
        return head1 == null && head2 == null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            SinglyLinkedList ll = new SinglyLinkedList();

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                int item = scanner.nextInt();
                ll.insertNode(item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();
            int n1 = scanner.nextInt();

            for (int i = 0; i < n1; i++) {
                int item = scanner.nextInt();
                llist2.insertNode(item);
            }

            boolean result = compareLists(ll.head, llist2.head);
            System.out.println(result ? 1 : 0);
        }
        scanner.close();
    }
}

