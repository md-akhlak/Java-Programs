package InteviewQuestions;

public class DeleteFromEnd_in_LL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private static Node Head;

    public void add(int data) {
        Node temp = new Node(data);

        if (Head == null) {
            Head = temp;
            return;
        }

        temp.next = Head;
        Head = temp;

    }

    public void deleteFromEnd_n_Node(int node) {
        int size = 0;
        Node temp = Head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (node == size) {
            Head = Head.next;
            return;
        }

        int i = 1;
        int findFromEnd = size - node;

        Node prev = Head;
        while (i < findFromEnd) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    public void print() {
        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public static void main(String[] args) {
        DeleteFromEnd_in_LL ll = new DeleteFromEnd_in_LL();
        ll.add(3);
        ll.add(4);
        ll.add(6);
        ll.add(1);
        ll.print();
        ll.deleteFromEnd_n_Node(3);
        ll.print();
    }
}
