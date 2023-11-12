package BITS_MANUPULATION;

import java.util.Scanner;

public class CheckOddEven {

    public static void oddEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println("The number is even " + num);
        } else {
            System.out.println("The number is odd " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();

        oddEven(num);

        sc.close();

    }
}
