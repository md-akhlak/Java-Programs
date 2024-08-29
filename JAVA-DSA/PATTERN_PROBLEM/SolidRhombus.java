package PATTERN_PROBLEM;

public class SolidRhombus {

    public static void rhombus(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            // spacesqwr ;
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= n; j++) {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        rhombus(5);

    }
}
