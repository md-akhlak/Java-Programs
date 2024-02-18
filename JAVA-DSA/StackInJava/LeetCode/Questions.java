package StackInJava.LeetCode;

import java.util.Stack;

public class Questions {

    private Stack<Integer> first;
    private Stack<Integer> second;
    private int front;

    public Questions() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        if (first.isEmpty()) {
            front = x;
        }
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public boolean empty() {
        return first.isEmpty();

    }

    // reverse string
    public static String reverseString(String str) {
        Stack<Character> ch = new Stack<>();
        int index = 0;

        while (index < str.length()) {
            ch.push(str.charAt(index));
            index++;
        }

        StringBuilder res = new StringBuilder();

        while (!ch.isEmpty()) {
            char curr = ch.pop();
            res.append(curr);
        }

        return res.toString();

    }

    // reverse stack
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    // print stack

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static String revString(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            int curr = s.pop();
            result.append(curr);
        }
        return result.toString();

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(1);
        stack.push(4);
        stack.push(6);

        reverseStack(stack);
        printStack(stack);



    }

}
