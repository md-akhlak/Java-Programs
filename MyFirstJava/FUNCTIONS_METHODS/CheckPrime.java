package FUNCTIONS_METHODS;

import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }
        // Optimied way to check number is prime or not.
        for (int i = 2; i <= Math.sqrt(n); i++) { // we can also use (n - 1) insted of Math.sqrt(n);
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));

        sc.close();
    }
}
