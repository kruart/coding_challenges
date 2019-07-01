package data_structures.BinarySearchTreeInsertion;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTreeInsertion {
    public static void preOrder( Node root ) {

        if( root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static Node insert(Node root,int data) {
        Node curr = root;
        Node node =new Node(data);
        if (root == null) return node;

        while (true) {
            if (curr.data == data) break;
            else if (curr.data > data) {
                if (curr.left == null) {
                    curr.left = node;
                    break;
                }
                curr = curr.left;
            } else {
                if (curr.right == null) {
                    curr.right = node;
                    break;
                }
                curr = curr.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}
