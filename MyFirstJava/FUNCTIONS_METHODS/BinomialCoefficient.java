package FUNCTIONS_METHODS;

import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            // fact *= i;
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_n_r);

        return bincoeff;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n and r");
        int n = in.nextInt();
        int r = in.nextInt();

        System.out.println(binCoeff(n, r));

    }
}
