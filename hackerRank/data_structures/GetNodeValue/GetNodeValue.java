package data_structures.GetNodeValue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
public class GetNodeValue {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }

            int position = scanner.nextInt();
            int result = getNode(llist.head, position);

            System.out.println(result);
        }
            scanner.close();
    }

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
    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // first way: in one loop
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode currentHead = head;
        SinglyLinkedListNode tempNode = head;
        int count = 0;

        while (tempNode.next != null) {
            tempNode = tempNode.next;

            if (positionFromTail == 0) currentHead = tempNode; //go to tail
            else if (++count % positionFromTail == 0 && tempNode.next != null) {
                currentHead = currentHead.next;
                tempNode = currentHead;
            }
        }
        return currentHead.data;
    }

    // second way: inner loop
    static int getNode2(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode currentHead = head;

        while (currentHead.next != null) {
            SinglyLinkedListNode tempNode = currentHead;
            for (int i = 0; i < positionFromTail; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode.next == null) break;
            currentHead = currentHead.next;
        }
        return currentHead.data;
    }
}
