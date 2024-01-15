package Questions;

public class Recursion {

    public static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        decreasing(n - 1);

    }

    public static void increasing(int n) {
        if (n == 0) {
            return;
        }
        increasing(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int naturalNumSUm(int n) {
        if (n == 0) {
            return 0;
        }
        return naturalNumSUm(n - 1) + n;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static int power(int m, int n) {
        if (n == 0) {
            return 1;
        }

        return m * power(m, n - 1);
    }

    public static int optimisedPower(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return optimisedPower(m * m, n / 2);
        } else {
            return optimisedPower(m * m, (n - 1) / 2) * m;
        }
    }

    public static void toweOfHanoi(int n, char A, char B, char C) {
        if (n > 0) {
            toweOfHanoi(n - 1, A, C, B);
            System.out.println(A + " -> " + C);
            toweOfHanoi(n - 1, B, A, C);
        }
    }



    public static void main(String[] args) {
        decreasing(5);
        System.out.println();
        increasing(7);
        System.out.println();
        System.out.println(fact(5));
        System.out.println(naturalNumSUm(5));
        System.out.println(fib(6));

        System.out.println(power(2, 8));

        System.out.println(optimisedPower(2, 8));

        toweOfHanoi(4, 'A', 'B', 'C');
    }
}
