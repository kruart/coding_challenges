package data_structures.InsertingANodeIntoASortedDoublyLinkedList;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
public class InsertingANodeIntoASortedDoublyLinkedList {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    // Complete the sortedInsert function below.
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode curr = head;
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);

        if (head.data >= data) {
            node.next = head;
            return node;
        }

        while (true) {
            if (curr.data > data) {
                node.prev = curr.prev;
                node.next = curr;
                curr.prev.next = node;
                curr.prev = node;
                break;
            } else if (curr.next == null) {
                curr.next = node;
                node.prev = curr;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            DoublyLinkedList ll = new DoublyLinkedList();
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                int item = scanner.nextInt();
                ll.insertNode(item);
            }

            int data = scanner.nextInt();
            printDoublyLinkedList(sortedInsert(ll.head, data), " ");
        }
        scanner.close();
    }
}
