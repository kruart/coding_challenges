package data_structures.InsertANodeAtTheTailOfALinkedList;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
public class InsertANodeAtTheTailOfALinkedList {
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

        public SinglyLinkedList() {
            this.head = null;
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

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) return new SinglyLinkedListNode(data);
        SinglyLinkedListNode currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new SinglyLinkedListNode(data);
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList ll = new SinglyLinkedList();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int item = scanner.nextInt();
            ll.head = insertNodeAtTail(ll.head, item);
        }
        printSinglyLinkedList(ll.head, "\n");
        scanner.close();
    }
}


