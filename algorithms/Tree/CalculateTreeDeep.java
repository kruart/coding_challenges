package Tree;

public class CalculateTreeDeep {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(20);
        root.left.left = new Node(10);
        root.left.right = new Node(30);

        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.print("The deep of the binary tree is " + height(root));
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}

class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}
