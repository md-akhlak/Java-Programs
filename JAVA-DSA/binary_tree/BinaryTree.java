package binary_tree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class BinaryTree {
    public BinaryTree() {
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node root;

    public void createTree(Scanner sc) {
        System.out.println("Enter the root node");
        int data = sc.nextInt();
        root = new Node(data);
        createTree(root, sc);
    }

    public void createTree(Node root, Scanner sc) {
        System.out.println("Do you want to enter the left of " + root.data);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value for left of " + root.data);
            int data = sc.nextInt();
            root.left = new Node(data);
            createTree(root.left, sc);
        }

        System.out.println("Do you want to enter the right of " + root.data);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value for right of " + root.data);
            int data = sc.nextInt();
            root.right = new Node(data);
            createTree(root.right, sc);
        }
    }

    public void pupulate(Scanner sc) {
        System.out.println("Enter the root node");
        int val = sc.nextInt();
        root = new Node(val);
        pupulate(sc, root);
    }

    private void pupulate(Scanner sc, Node node) {
        System.out.println("do you enter the value at left node " + node.data);
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.println("Enter the value at node " + node.data);
            int val = sc.nextInt();
            node.left = new Node(val);
            pupulate(sc, node.left);
        }

        System.out.println("do you enter the value at right node " + node.data);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("enter val at right of node " + node.data);
            int val = sc.nextInt();
            node.right = new Node(val);
            pupulate(sc, node.right);
        }

    }

    public Node buildTree(Node node) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node");
        int data = sc.nextInt();
        root = new Node(data);

        if (data == -1) {
            sc.close();
            return null;
        }

        System.out.println("Enter the data for left node " + node.data);
        root.left = buildTree(root.left);
        System.out.println("Enter the data for right node " + node.data);
        root.right = buildTree(root.right);
        sc.close();
        return root;

    }

    public void display() {
        displayTree(root, "");
    }

    private void displayTree(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        displayTree(node.left, indent + "\t");
        displayTree(node.right, indent + "\t");
    }

    public void displayBest() {
        display2(root, 0);
    }

    private void display2(Node node, int level) {
        if (node == null) {
            return;
        }

        display2(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|----->");
            }
            System.out.println(node.data);
        } else {
            display2(node.left, level + 1);
        }

    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }

            } else {
                System.out.println(node.data);
            }

            if (node.left == null) {
                queue.add(node.left);
            }
            if (node.right == null) {
                queue.add(node.right);
            }

        }

    }

}
