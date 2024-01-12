package InteviewQuestions;


public class CycleLL {
    private static Node Head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;

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

        if (Head != null) {
            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp != Head);
        }
        assert temp != null;
        System.out.println(temp.data);
        System.out.println("END");
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


    public static boolean isCycle() {  // this algo is known as floyd's cycle finding algorithm
        Node fast = Head;
        Node slow = Head;

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }

        }

        return false;

    }

    public static int countCycle(Node head) {
        Node fast = Head;
        Node slow = Head;

        while (fast != null && slow != null) {
            fast = fast.next;
            slow = slow.next;

            if (fast == slow) {
                Node temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }

        return 0;
    }


    public static Node findNode() {
        Node fast = Head;
        Node slow = Head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                length = countCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        Node first = Head;
        Node second = Head;

        while (length > 0) {
            second = second.next;
            length--;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    public static void main(String[] args) {

        CycleLL cll = new CycleLL();

        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.addFirst(9);
        cll.addFirst(5);

        cll.display();


    }
}
