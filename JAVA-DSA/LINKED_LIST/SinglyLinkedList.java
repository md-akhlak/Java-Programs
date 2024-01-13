package LINKED_LIST;

import java.util.LinkedList;

public class SinglyLinkedList {

    private static Node head;
    private static Node tail;
    private static int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }


    void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode next -> head;
        newNode.next = head;

        // head -> new node
        head = newNode;
        size++;

    }

    public void addLast(int data) {
        // create a node
        Node newNode = new Node(data);

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // tail next -> new node
        tail.next = newNode;

        // tail -> new node;
        tail = newNode;
        size++;

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

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

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

    public Node get(int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;

        }
        return null;
    }


    // healper function for recursive search
    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }


        int getIdx = helper(head.next, key);

        if (getIdx == -1) {
            return -1;
        }

        return getIdx + 1;

    }

    // recursive function
    public static int recSearch(int key) {
        return helper(head, key);
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

    public void insertInSortedLL(int val) {
        Node node = new Node(val);

        Node p = head;
        Node q = null;

        while (p != null && p.data < val) {
            q = p;
            p = p.next;
        }

        if (p == head) {
            node.next = head;
            head = node;
        } else {
            node.next = q.next;
            q.next = node;
        }

    }

    public boolean isSorted() {
        Node temp = head;
        int x = -1;
        while (temp != null) {
            if (temp.data < x) {
                return false;
            }
            x = temp.data;
            temp = temp.next;

        }
        return true;
    }

    public void removeDupInSorted() {
        Node q = head.next;
        Node p = head;

        while (q != null && q.next != null) {

            if (p.data != q.data) {
                p = q;
                q = q.next;
            }

            p.next = q.next;
            q = p.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(12);
        sll.addFirst(8);
        sll.addFirst(8);
        sll.addFirst(8);
        sll.addFirst(8);
        sll.addFirst(4);
        sll.addFirst(2);
        sll.addFirst(2);

        sll.printLL();
        System.out.println(sll.isSorted());

        sll.removeDupInSorted();
        sll.printLL();


        LinkedList<Integer> obj = new LinkedList<>();
        obj.add(3);
        obj.add(5);
        obj.add(9);
        obj.add(4);
        System.out.println(obj.toString());


        SinglyLinkedList ll = new SinglyLinkedList();

        // add first
        // ll.printLL();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(8);

        // add last
        ll.addLast(11);
        ll.addLast(22);
        ll.addLast(33);
        ll.printLL();

        ll.addPosition(5, 99);
        ll.printLL();
        System.out.println("Size is : " + SinglyLinkedList.size);

        System.out.println(ll.deleteGivenNode(2));
        ll.printLL();

        System.out.println("size is : " + SinglyLinkedList.size);

        System.out.println("max is : " + ll.max());

        System.out.println("min is : " + ll.min());

        System.out.println("sum is : " + ll.sum());


        ll.printLL();

        System.out.println(ll.get(33));

        ll.reverse();
        ll.printLL();

        System.out.println(ll.removeFirst());
        ll.printLL();

        System.out.println();


    }
}
