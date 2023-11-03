package PATTERN_PROBLEM;

public class DiamondPattern {

    public static void diamond(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        diamond(3);

    }
}
