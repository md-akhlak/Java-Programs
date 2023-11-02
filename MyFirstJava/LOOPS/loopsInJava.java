package LOOPS;

public class loopsInJava {
    public static void main(String[] args) {

        // for loops in Java
        System.out.println("using for loop");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        // while loops in Java
        System.out.println();
        System.out.println("using while loop");
        int n = 0;
        while (n < 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        // do-while loops in Java
        System.out.println("using do-while loop");
        int x = 0;
        do {
            System.out.print(x + " ");
            x++;
        } while (x < 10);

    }
}
