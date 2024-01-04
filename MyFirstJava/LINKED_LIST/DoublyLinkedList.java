package LINKED_LIST;

public class DoublyLinkedList {

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    private Node head;

    public void insertFirst(int data) {
        Node node = new Node(data);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;

    }

    // public void insertFirst(int data) {
    // Node node = new Node(data);

    // node.next = head;
    // node.prev = null;

    // if (head != null) {
    // head.prev = node;
    // }

    // head = node;

    // }

    public void insertLast(int data) {

        Node lastNode = new Node(data);
        Node travNode = head;

        lastNode.next = null;

        if (head == null) {
            lastNode.prev = null;
            head = lastNode;
            return;
        }

        while (travNode.next != null) {
            travNode = travNode.next;
        }

        travNode.next = lastNode;
        lastNode.prev = travNode;

    }

    // public void lastNode(int data) {
    // Node newNode = new Node(data);
    // Node first = head;

    // newNode.next = null;

    // if (head == null) {
    // newNode.prev = null;
    // head = newNode;
    // return;
    // }

    // while (first.next != null) {
    // first = first.next;
    // }

    // first.next = newNode;
    // newNode.prev = first;
    // }

    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if (temp == null) {
            return;
        }

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp.next != null && temp.data == key) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

    }

    public void display() {
        Node node = head;

        System.out.println("Forward direction");
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("END");

    }

    public void displayReverse() {

        Node node = head;
        Node last = null;

        // System.out.println("Forward direction");

        while (node != null) {

            // System.err.print(node.data + "->");
            last = node;
            node = node.next;
        }
        // System.out.println("");

        System.out.println("Reverse direction");
        while (last != null) {
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(1);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(8);
        dll.insertFirst(2);
        dll.insertLast(6);
        dll.insertLast(5);
        // dll.insertFirst(11);
        // dll.lastNode(7);

        dll.deleteNode(5);

        dll.display();
        // dll.displayReverse();
    }
}
