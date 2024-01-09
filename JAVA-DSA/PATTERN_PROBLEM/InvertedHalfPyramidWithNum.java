package PATTERN_PROBLEM;

public class InvertedHalfPyramidWithNum {
    public static void main(String[] args) {

        int n = 5;

        // Method 1

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // // System.out.print(i + " ");
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        
        // Method 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}