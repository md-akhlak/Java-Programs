package QueueInJava;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaQueue {
    public static void main(String[] args) {

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