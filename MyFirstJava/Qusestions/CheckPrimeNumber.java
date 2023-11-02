package Qusestions;

import java.util.*;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n == 2) {
                    System.out.println("The number is prime");
                }
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("THe number is prime");
        } else {
            System.out.println("The number is not prime");
        }

    }
}
