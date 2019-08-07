package data_structures.CycleDetection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
public class CycleDetection {
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
            System.out.println(node.data);

            node = node.next;

            if (node != null) {
                System.out.println(sep);
            }
        }
    }

    // write your code here
    static boolean hasCycle(SinglyLinkedListNode head) {
        Set<SinglyLinkedListNode> s = new HashSet<>();
        SinglyLinkedListNode node = head;

        while (node.next != null) {
            if (s.contains(node.next)) return true;
            s.add(node);
            node = node.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int testsItr = 0; testsItr < N; testsItr++) {
            int index = scanner.nextInt();

            SinglyLinkedList ll = new SinglyLinkedList();

            int llistCount = scanner.nextInt();

            for (int i = 0; i < llistCount; i++) {
                int item = scanner.nextInt();
                ll.insertNode(item);
            }

            SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
            SinglyLinkedListNode temp = ll.head;

            for (int i = 0; i < llistCount; i++) {
                if (i == index) {
                    extra = temp;
                }

                if (i != llistCount-1) {
                    temp = temp.next;
                }
            }

            temp.next = extra;
            boolean result = hasCycle(ll.head);
            System.out.println(result ? 1 : 0);
        }
        scanner.close();
    }
}

