package Qusestions;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 28767;

        // while (n > 0) {
        // int last = n % 10;
        // System.out.print(last);
        // n /= 10;
        // }

        System.out.println();

        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(rev);

    }
}
