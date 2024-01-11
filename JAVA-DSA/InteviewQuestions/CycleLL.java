package InteviewQuestions;


public class CycleLL {
    private static Node Head;
    private static Node tail;

    public CycleLL() {
        int size = 0;
    }


    private class Node {
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


    public boolean isCycle() {
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

    public int countCycle(Node head) {
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
}
