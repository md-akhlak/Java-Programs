package LINKED_LIST;

import java.awt.*;

public class QuestionLL {

    private static Node Head;
    private static Node tail;
    private static int size;

    private class Node {
        int data;
        Node next;

        public Node() {
        }

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
            size++;
            return;
        }

        node.next = Head;
        Head = node;
        size++;
    }

    public void addLast(int data) {
        // create a node
        Node newNode = new Node(data);
        Node temp = Head;

        // base case
        if (Head == null) {
            Head = tail = newNode;
            return;
        }

        while (temp != null) {
            temp = temp.next;
        }

        tail.next = newNode;

        newNode.next = null;

    }

    public void display() {
        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertRec(int val, int index) {
        Head = insertRec(val, index, Head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);  //index-1;
        return node;

    }

    public int getSize() {
        Node temp = Head;
        while (temp != null) {
            size++;
        }
        return size;
    }

    //    remove duplicates
    public void removeDuplicates() {
        Node node = Head;

        if (node.next == null) {
            return;
        }

        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
    }

    private Node removeDup(Node node) {
        Node temp = Head;

        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return Head;
    }

    private Node findMid(Node node) {
        //
        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome() {
        if (Head == null && Head.next == null) {
            return true;
        }

//        find mid

        Node mid = findMid(Head);

//        reverse
        Node curr = mid;
        Node prev = null;
        Node beforePrev = null;

        while (curr != null) {
            beforePrev = prev;
            prev = curr;
            curr = curr.next;
            prev.next = beforePrev;
        }

        Node right = prev;
        Node leaft = Head;

        while (right != null) {
            if (leaft.data != right.data) {
                return false;
            }
            leaft = leaft.next;
            right = right.next;
        }

        return true;

    }


    public static QuestionLL merge(QuestionLL first, QuestionLL second) {
        Node f = first.Head;
        Node s = second.Head;

        QuestionLL resLL = new QuestionLL();

        while (f != null && s != null) {
            if (f.data < s.data) {
                resLL.addLast(f.data);
                f = f.next;
            } else {
                resLL.addLast(s.data);
                s = s.next;
            }
        }

        while (f != null) {
            resLL.addLast(f.data);
            f = f.next;
        }

        while (s != null) {
            resLL.addLast(s.data);
            s = s.next;
        }

        return resLL;

    }

//    cyclic Linked list or not

    public boolean isCyclic(Node head) {
        Node fast = Head;
        Node slow = Head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    public static Node removeNthFromEnd(int n) {
        return removeNthFromEnd(Head, n);
    }

    private static Node removeNthFromEnd(Node node, int n) {
        Node slow = Head;
        Node fast = Head;

        int i = 0;
        while (i < n) {
            fast = fast.next;
            i++;
        }

        if (fast == null) return slow.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return Head;

    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node head = new Node(0);
        Node curr = head;
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        while (list1 != null) {
            curr.next = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            curr.next = list2;
            list2 = list2.next;

        }

        return head.next;

    }


    public Node addTwoNumbers(Node l1, Node l2) {
        return rec(l1, l2);
    }

    private Node rec(Node l1, Node l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            l1 = new Node(0);
        }

        if (l2 == null) {
            l2 = new Node(0);
        }

        int result = l1.data + l2.data;

        if (result > 9) {
            result = result % 10;
            if (l1.next == null) {
                l1.next = new Node(1);
            } else {
                l1.next.data = l1.next.data + 1;
            }
        }

        return new Node(result, rec(l1.next, l2.next));
    }


    public static void main(String[] args) {

        QuestionLL ll = new QuestionLL();
//        ll.display();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(6);
        ll.addFirst(6);
        ll.addFirst(9);
        ll.addFirst(3);
        ll.display();
        ll.insertRec(34, 6);
        ll.display();

//        method to remove duplicates
        ll.removeDuplicates();
        ll.display();

        ll.removeDup(Head);
        ll.display();
        System.out.println(removeNthFromEnd(2));
//        System.out.println(ll.isCyclic(Head));


//        ll.isPalindrome();


//        QuestionLL first = new QuestionLL();
//        first.addLast(1);
//        first.addLast(1);
//        first.addLast(2);
//        first.addLast(5);
//        first.addLast(8);
//
//        QuestionLL second = new QuestionLL();
//        second.addLast(4);
//        second.addLast(4);
//        second.addLast(5);
//        second.addLast(6);
//        second.addLast(9);
//
//        QuestionLL ans = QuestionLL.merge(first, second);
//        ans.display();


    }

}
