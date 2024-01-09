package PATTERN_PROBLEM;

public class Butteryfly {

    public static void butterFly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // print star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // print start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // print star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // print star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        butterFly(5);

    }
}
