package JAVA_OOPS;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        // exception handling
        try {
            int c = a / b;
            System.out.println("The result is : " + c);
        } catch (Exception e) {
            System.out.println("Failed to divide ");
            System.out.println(e);
        }

        System.out.println("Program end");
        // nested exception handling

        // int arr[] = new int[4];
        

        sc.close();

    }
}
