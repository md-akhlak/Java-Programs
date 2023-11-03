package PATTERN_PROBLEM;

public class PalindronePattern {

    public static void palindromeNumber(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // decending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // accending
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        palindromeNumber(8);

    }
}
