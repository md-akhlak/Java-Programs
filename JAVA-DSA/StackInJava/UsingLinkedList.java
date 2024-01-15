package StackInJava;

public class UsingLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static class Stack {
        static Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                node = head;
                return;
            }

            node.next = head;
            head = node;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is emptry");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        Stack obj = new Stack();


        obj.push(2);
        obj.push(4);
        obj.push(6);
        obj.push(8);
        obj.push(10);


        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();
        }
    }


}
