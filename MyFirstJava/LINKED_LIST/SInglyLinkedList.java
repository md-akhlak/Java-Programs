package LINKED_LIST;

public class SInglyLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    private static Node tail;
    private static int size;

    void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode next -> head;
        newNode.next = head;

        // head -> new node
        head = newNode;

    }

    public void addLast(int data) {
        // create a node
        Node newNode = new Node(data);
        size++;
        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // tail next -> new node
        tail.next = newNode;

        // tail -> new node;
        tail = newNode;
    }

    public void printLL() {
        if (tail == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addPosition(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void insert(int index, int value) {
        Node node = new Node(value);
        Node temp = head;
        int i = 0;

        if (head == null) {
            head = tail = node;
            return;
        }
        // insert at first position
        if (index == 0) {
            node.next = head;
            head = node;
            size = 0;
            return;
        }
        // insert at any position
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public int deleteFirstNode() {
        Node temp = head;

        head = head.next;
        int val = temp.data;

        return val;

    }

    public int deleteGivenNode(int pos) {
        Node p = head;
        Node q = null;
        int val = 0;

        if (pos == 0) {
            return Integer.MIN_VALUE;
        }

        if (pos == 1) {
            val = p.data;
            head = head.next;
            size = 0;
        } else {

            for (int i = 0; i < pos - 1; i++) {
                q = p;
                p = p.next;
                val = p.data;
                size--;
            }

            q.next = p.next;

        }

        return val;

    }

    public int sum() {
        Node temp = head;
        int sum = 0;

        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public int max() {
        Node temp = head;
        int max = Integer.MIN_VALUE;

        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public int min() {
        Node temp = head;
        int min = Integer.MAX_VALUE;

        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }

    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (key == temp.data) {
                System.out.print("Key : " + key + " found at index : ");
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // healper function for recursive search
    public static int healper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int getIdx = healper(head.next, key);

        if (getIdx == -1) {
            return -1;
        }

        return getIdx + 1;

    }

    // recursive function
    public static int recSearch(int key) {
        return healper(head, key);
    }

    // remove nodes
    public int removeFirst() {
        int val;
        if (size == 0) {
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // reverse bye nodes of linked list
    public void reverse() {
        Node currNode = head;
        Node prevNode = null;
        Node nextNode;

        while (currNode != null) {
            nextNode = prevNode;
            prevNode = currNode;
            currNode = currNode.next;
            prevNode.next = nextNode;
        }

        head = prevNode;

    }

    public static void main(String[] args) {
        SInglyLinkedList ll = new SInglyLinkedList();

        // add first
        // ll.printLL();
        ll.addFirst(2);
        // ll.printLL();
        ll.addFirst(4);
        // ll.printLL();
        ll.addFirst(6);
        // ll.printLL();
        ll.addFirst(8);
        // ll.printLL();

        // add last
        ll.addLast(11);
        // ll.printLL();
        ll.addLast(22);
        // ll.printLL();
        ll.addLast(33);
        ll.printLL();

        ll.addPosition(5, 99);
        ll.printLL();
        System.out.println("Size is : " + SInglyLinkedList.size);

        System.out.println(ll.deleteGivenNode(2));
        ll.printLL();

        System.out.println("size is : " + SInglyLinkedList.size);

        System.out.println("max is : " + ll.max());

        System.out.println("min is : " + ll.min());

        System.out.println("sum is : " + ll.sum());

        System.out.println("sum is : " + ll.sum());

        ll.printLL();

        System.out.println(ll.search(33));

        ll.reverse();
        ll.printLL();

        System.out.println(ll.removeFirst());
        ll.printLL();
    }
}
