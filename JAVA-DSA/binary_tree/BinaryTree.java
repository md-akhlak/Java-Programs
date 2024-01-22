package binary_tree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {
    }


    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left) {
            this.data = data;
            this.left = left;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }


    }

    public static Node root;

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

    public void insert(Scanner sc) {
        System.out.println("Enter the root node ");
        int val = sc.nextInt();
        root = new Node(val);
        insert(sc, root);
    }

    private void insert(Scanner sc, Node node) {
        System.out.println("Do you wan to insert left of " + node.data);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter value for left of " + node.data);
            int val = sc.nextInt();
            node.left = new Node(val);
            insert(sc, node.left);
        }

        System.out.println("Do you want inset right of " + node.data);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the val for right of " + node.data);
            int val = sc.nextInt();
            node.right = new Node(val);
            insert(sc, node.right);
        }
    }

    public Node buildTree(Node node) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node");
        int data = sc.nextInt();
        root = new Node(data);

        if (data == -1) {
            return null;
        }

        System.out.println("Enter the data for left node");
        root.left = buildTree(root.left);
        System.out.println("Enter the data for right node");
        root.right = buildTree(root.right);

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

    public void displayBest(){
        display2(root, 0);
    }

    private void display2(Node node, int level){
        if(node == null){
            return;
        }

        display2(node.right, level+1);

        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|----->");
            }
            System.out.println(node.data);
        }else{
            display2(node.left, level+1);
        }

    }


}
