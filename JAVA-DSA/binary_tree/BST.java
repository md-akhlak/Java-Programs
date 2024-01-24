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

    public void insertNode(int ele) {
        Node t = root;
        Node r, p;

        if (root == null) {
            p = new Node(ele);
            p.val = ele;
            p.left = p.right = null;
        }

        while (t != null) {
            r = t;
            if (ele == t.val) {
                return;
            } else if (ele < t.val) {
                t = t.left;
            } else {
                t = t.right;
            }
        }

    }

    private void insertNode(Node node, int ele) {
        Node r = null;
        Node p = new Node(ele);

        if (node == null) {
            node = new Node(ele);
            root = node;
            return;
        }

        while (node != null) {
            r = node;
            if (ele == node.val)
                return;
            else if (ele < node.val)
                node = node.left;
            else
                node = node.right;

        }

        p.left = p.right = null;

        if (p.val < r.val)
            r.left = p;
        else
            r.right = p;

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


    public void levelOrder(Node node) {
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

    public static void main(String[] args) {
        BST tree = new BST();


    }
}


