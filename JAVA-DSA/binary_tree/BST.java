package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    public static class Node {
        private Node left;
        private int val;
        private Node right;

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

    public Node create(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.val > val) {
            root.left = create(root.left, val);
        } else {
            root.right = create(root.right, val);
        }
        return root;
    }

    public boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.val == key)
            return true;
        if (root.val > key)
            return search(root.left, key);
        return search(root.right, key);
    }

    public void recInsert(int ele) {
        recInsert(root, ele);
    }

    private Node recInsert(Node root, int ele) {
        Node eleNode;
        if (root == null) {
            eleNode = new Node(ele);
            eleNode.val = ele;
            eleNode.left = eleNode.right = null;
            return eleNode;
        }

        if (ele < root.val) {
            root.left = recInsert(root.left, ele);
        } else {
            root.right = recInsert(root.right, ele);
        }

        return root;
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
            System.out.println(node.val);
        } else {
            display2(node.left, level + 1);
        }

    }

    // traversal type

    // preorder
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;

        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    // inorder
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
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

    public void levelOrder(Node node) {
        if (node == null)
            return;

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

    public Node sortedArrayToBST(int arr[]) {
        return createBST(arr, 0, arr.length - 1);
    }

    private Node createBST(int arr[], int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        Node node = new Node(arr[mid]);

        node.left = createBST(arr, start, mid - 1);
        node.right = createBST(arr, mid + 1, end);

        return node;

    }

    // delete the node
    public Node delete(Node root, int key) {
        if (root.val < key) {
            root.right = delete(root.right, key);
        } else if (root.val > key) {
            root.left = delete(root.left, key);
        }

        else {
            // case 1:
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2:
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node is = inorderSuccessor(root.right);
            root.right = is.right;
            root.right = delete(root.right, is.val);
        }
        return root;
    }

    private Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 6, 8, 3, 9, 1 };
        Node root = null;

        BST bst = new BST();
        bst.create(root, 5);

        for (int i = 0; i < arr.length; i++) {
            bst.create(root, i);
        }

    }
}
