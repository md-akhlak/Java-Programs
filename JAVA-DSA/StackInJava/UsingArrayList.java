package StackInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class UsingArrayList {

    static class Stack {
        static ArrayList<Integer> stack = new ArrayList<>();

        public boolean isEmpty() {
            return stack.size() == 0;
        }

        public void push(int data) {
            stack.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return stack.get(stack.size() - 1);
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
