package PATTERN_PROBLEM;

public class InvertPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // for print space " "
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // for print *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
