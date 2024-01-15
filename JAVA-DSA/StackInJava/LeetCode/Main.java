package StackInJava.LeetCode;

import java.util.Stack;

import static StackInJava.LeetCode.Questions.*;

public class Main {
    public static void main(String[] args) {


        Stack<Integer> obj = new Stack<>();

        obj.push(3);
        obj.push(4);
        obj.push(6);
        obj.push(9);
        obj.push(1);

        while(!obj.isEmpty()){
            System.out.println(obj.pop());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.push(2);

//      push at bottom
//        pushAtBottom(stack, 5);

//        reverse string
        String name = "samar";
        System.out.println(reverseString(name));

//        reverse stack
        reverseStack(stack);
        printStack(stack);
    }
}
