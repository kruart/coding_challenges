package data_structures.DeleteDuplicateValueNodesFromASortedLinkedList;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
public class DeleteDuplicateValueNodesFromASortedLinkedList {
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

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertNode(head.data);

        while (head.next != null) {
            if (ll.tail.data != head.next.data) {
                ll.insertNode(head.next.data);
            }
            head = head.next;
        }
        return ll.head;
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
            SinglyLinkedListNode uniqueItems = removeDuplicates(ll.head);
            printSinglyLinkedList(uniqueItems, " ");
        }
        scanner.close();
    }
}


