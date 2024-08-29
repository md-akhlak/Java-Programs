package LINKED_LIST;

public class Mergeee {

    private static Node Head;
    private static Node tail;

    public static int size;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data) {
        Node node = new Node(data);

        if (Head == null) {
            Head = node;
            return;
        }

        node.next = Head;
        Head = node;
    }

//    add in last

    public void addLast(int data) {
        Node node = new Node(data);
        Node temp = Head;

        if(Head == null){
            Head = tail = node;
        }

        while(temp != null){
            temp = temp.next;
        }

        tail.next = node;
        node.next = null;

    }


//    find mid in linked list

     private Node getMid(Node head) {
        Node slow = Head;
        Node fast = Head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    @SuppressWarnings("null")
    private Node merge(Node head1, Node head2) {
//        temp node to store data
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 == null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }

    public Node mergeSort(Node head) {
//        base case
        if (Head == null || Head.next == null)  {
            return Head;
        }


//      find mid Node
        Node mid = getMid(Head);

        Node rightMid = mid.next;
        mid.next = null;

        Node left = mergeSort(Head);
        Node right = mergeSort(rightMid);

        return merge(left, right);

    }

    //    display linked list
    public void displayLL() {
        Node node = Head;

        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Mergeee ll = new Mergeee();


        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(3);
        ll.displayLL();

        ll.addLast(6);
        ll.addLast(45);
        ll.displayLL();
    }

}
