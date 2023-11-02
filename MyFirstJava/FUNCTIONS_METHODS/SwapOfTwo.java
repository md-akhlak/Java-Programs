package FUNCTIONS_METHODS;

public class SwapOfTwo {

    public static void swapTwo(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);
    }

    // Main or Driver function
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("Before swap");
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);

        System.out.println("After swap");
        swapTwo(x, y);

    }
}
