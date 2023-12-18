package PATTERN_PROBLEM;

/*

 * * * *
 * * *
 * *
 * 
 
 */

public class InvertedHalfPyramid {

    public static void inverted(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // other approach

        inverted(5);

    }
}
