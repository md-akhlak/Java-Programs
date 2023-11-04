package LOOPS;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // question
        do {
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            n++;
        } while (true);

        System.out.println();

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();

        // question
        do {
            System.out.print("Enter you number : ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            } else {
                System.out.println("The number is " + num);
            }

        } while (true);

        // sc.close();

    }
}
