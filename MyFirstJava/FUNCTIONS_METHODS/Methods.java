package FUNCTIONS_METHODS;

import java.util.*;

public class Methods {

    public static void calculateSum(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        System.out.print("sum is = " + sum);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 and num2 ");
        int a = input.nextInt();
        int b = input.nextInt();

        calculateSum(a, b); // arguments or actual parameters

        input.close();

    }
}
