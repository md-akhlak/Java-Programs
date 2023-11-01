package PATTERN_PROBLEM;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter row");
            int row = sc.nextInt();
            System.out.print("enter column : ");
            int col = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}
