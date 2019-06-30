package data_structures.TreeTopView;

import java.util.*;

// https://www.hackerrank.com/challenges/tree-top-view/problem
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

public class TreeTopView {
    //START: write your code here
    static class DeepNode {
        Node node;
        int hd; // horizontal distance

        DeepNode(Node node, int hd)  {
            this.node = node;
            this.hd = hd;
        }
    }

     static void topView(Node root) {
        TreeMap<Integer, Node> sortedMap= new TreeMap<>();
        Queue<DeepNode> q = new LinkedList<>();
        q.add(new DeepNode(root, 0));

        // Level Order Traversal
        while (q.size() != 0) {
            DeepNode deepNode = q.poll();
            Node node = deepNode.node;

            if (!sortedMap.containsKey(deepNode.hd))
                sortedMap.put(deepNode.hd, node);

            if (node.left != null)
                q.add(new DeepNode(node.left, deepNode.hd - 1));
            if (node.right != null)
                q.add(new DeepNode(node.right, deepNode.hd + 1));
        }

        sortedMap.values().forEach(n -> System.out.print(n.data + " "));
    }
    // END

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
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
        topView(root);
    }
}
