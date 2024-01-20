package binary_tree;

public class BST {

    public class Node {
        private Node left;
        private int val;
        private Node right;

        private int height;

        public Node(int val) {
            this.val = val;
        }

        public boolean isEmpty() {
            return root == null;
        }

        public int height(Node node) {
            return node.height;
        }

        public int getValue(int val) {
            return getValue(val);
        }

    }

    private Node root;

    public void insert(int value) {

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

    public void populate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
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
}


