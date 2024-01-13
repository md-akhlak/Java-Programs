package LINKED_LIST;

public class CircularLinkedList {

    private static Node Head;
    private static Node tail;

    private static int flag = 0;

    public CircularLinkedList() {
        int size = 0;
    }


    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);

        if (Head == null) {
            Head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = Head;
        tail = node;
    }

    public void display() {
        Node temp = Head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != Head);

        System.out.println();

    }


    public void recDisplay(Node head) {
        if (head != Head || flag == 0) {
            flag = 1;
            System.out.print(head.data + "->");
            recDisplay(head.next);
        }
        flag = 0;
        System.out.println();
    }

    public void deleteNode(int val) {
        Node node = Head;

        if (Head == null) {
            return;
        }

        if (node.data == val) {
            Head = node.next;
            tail.next = Head;
            return;
        }

        do {
            Node temp = node.next;
            if (temp.data == val) {
                node.next = temp.next;
                break;
            }

            node = node.next;
        } while (node != Head);


    }


    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst(2);
        cll.addFirst(3);
        cll.addFirst(6);
        cll.addFirst(8);

        cll.display();

        cll.recDisplay(Head);
    }

}
