package FUNCTIONS_METHODS;

import java.util.Scanner;

public class PrimeInRange {

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

    public static void primeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = in.nextInt();

        primeinRange(n);
    }
}
