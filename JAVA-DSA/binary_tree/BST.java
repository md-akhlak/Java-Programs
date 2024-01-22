package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    public class Node {
        private Node left;
        private int val;
        private Node right;

        private int height;

        public Node(int val) {
            this.val = val;
        }

    }

    private Node root;

    public void insert(int value) {
        insert(root, 3);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.val) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public void display() {
        display(root, "Root Node");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println("Root node " + node.val);
        display(node.left, "Left child of : " + node.val);
        display(node.right, "Right chile of : " + node.val);


    }

    public void displayBest() {
        displayBest(root, 0);
    }

    private void displayBest(Node node, int level) {
        if (node == null) {
            return;
        }

        displayBest(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|----->");
            }
            System.out.println(node.val);
        } else {
            displayBest(node.left, level + 1);
        }
    }

//    traversal type

    //    preorder
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) return;

        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    //    inorder
    public void inOder(Node right) {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.println(node.val);
        inOder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }


    public void leverOrder(Node node) {
        if (node == null) return;

        Queue<Node> tree = new LinkedList<>();

        tree.add(root);
        tree.add(null);

        while (!tree.isEmpty()) {
            Node currNode = tree.remove();
            if (node == null) {
                System.out.println();

                if (tree.isEmpty()) {
                    break;
                } else {
                    tree.add(null);
                }
            } else {
                System.out.println(node.val);
                if (node.left != null)
                    tree.add(node.left);
                if (node.right != null)
                    tree.add(node.right);
            }
        }

    }

    public static void main(String[] args) {
        BST tree = new BST();


    }
}


