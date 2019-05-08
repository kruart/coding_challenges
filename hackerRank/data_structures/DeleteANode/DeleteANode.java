package data_structures.DeleteANode;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
public class DeleteANode {
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

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (position == 0) return head.next;
        SinglyLinkedListNode prev = head;
        SinglyLinkedListNode current = head;

        while (current.next != null) {
            position--;
            current = current.next;
            if (position == 0) {
                prev.next = current.next;
                return head;
            } else if (current.next != null) {
                prev = current;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();
        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        System.out.print(llist1.data + " ");
        while (llist1.next != null) {
            llist1 = llist1.next;
            System.out.print(llist1.data + " ");
        }
    }
}