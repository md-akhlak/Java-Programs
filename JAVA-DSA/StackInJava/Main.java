package StackInJava;

public class Main {
    public static void main(String[] args) throws Exception {

//        custom stack
        CustomStack customStack = new CustomStack();


        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        customStack.push(7);
        customStack.push(9);
        customStack.push(9);


        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());


//        dynamic stack
        DynamicStack dynamicStack = new DynamicStack();

        dynamicStack.push(4);
        dynamicStack.push(2);
        dynamicStack.push(12);
        dynamicStack.push(9);
        dynamicStack.push(46);
        dynamicStack.push(98);


        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());


    }
}
