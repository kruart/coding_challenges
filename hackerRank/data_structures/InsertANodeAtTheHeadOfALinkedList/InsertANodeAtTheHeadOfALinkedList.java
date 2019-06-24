package data_structures.InsertANodeAtTheHeadOfALinkedList;

import java.io.IOException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
public class InsertANodeAtTheHeadOfALinkedList {
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
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode ll = new SinglyLinkedListNode(data);
        ll.next = llist;
        return ll;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList ll = new SinglyLinkedList();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int item = scanner.nextInt();
            ll.head = insertNodeAtHead(ll.head, item);
        }

        printSinglyLinkedList(ll.head, "\n");
        scanner.close();
    }
}