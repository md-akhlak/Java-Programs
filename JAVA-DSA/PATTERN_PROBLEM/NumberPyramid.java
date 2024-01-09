package PATTERN_PROBLEM;

public class NumberPyramid {

    public static void numberPyramid(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // for number
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        numberPyramid(4);

    }
}
