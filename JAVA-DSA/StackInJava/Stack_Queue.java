package StackInJava;

import java.util.*;

public class Stack_Queue {
    public static void main(String[] args) {

//        stack

        System.out.println("stack");
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);

        System.out.println();

//        queue
        System.out.println("queue");

        Queue<Integer> queue = new LinkedList<>();

        queue.add(20);
        queue.add(90);
        queue.add(12);
        queue.add(33);

//        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.remove(9));
        System.out.println(queue.remove(90));


        System.out.println(queue);

        System.out.println();

//        deque

        System.out.println("deque");

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(3);
        deque.addFirst(5);
        deque.addLast(90);
        deque.addLast(92);
        deque.addLast(19);
        deque.addLast(9);
        deque.addLast(49);
        deque.addLast(89);
        deque.addLast(55);
        deque.addLast(900);
        deque.addLast(912);

        System.out.println(deque);

        System.out.println(deque.remove(30));
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println(deque);

    }


}


