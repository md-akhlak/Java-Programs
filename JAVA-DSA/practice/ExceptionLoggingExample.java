package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.logging.*;

public class ExceptionLoggingExample {
    private static final Logger logger = Logger.getLogger(ExceptionLoggingExample.class.getName());

    public static void main(String[] args) {
        // int resut;
        // try {
        // // Code that may throw an exception
        // resut = 10 / 0; // ArithmeticException: Division by zero
        // } catch (ArithmeticException e) {
        // // Log the exception
        // logger.log(Level.SEVERE, "An arithmetic exception occurred", e);
        // }

        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("banana");
        set.add("apple"); // Duplicate element, will not be added

        // Printing the elements of the set
        System.out.println("Set elements: " + set);

        List<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("apple");
        list.add("banana");
        list.add("apple"); // Duplicate element

        // Printing the elements of the list
        System.out.println("List elements: " + list);

        // Creating a LinkedList as a Queue
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("orange");

        // Removing and printing elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 8);

        // Iterating over the map and printing key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
