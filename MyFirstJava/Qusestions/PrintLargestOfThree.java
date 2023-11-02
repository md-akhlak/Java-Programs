package Qusestions;

public class PrintLargestOfThree {
    public static void main(String[] args) {
        int a = 70;
        int b = 90;
        int c = 300;

        if (a > b && a > c) {
            System.out.print("The lasgst is a " + a);
        } else if (b > c) {
            System.out.print("The lasgst is b " + b);
        } else {
            System.out.print("The lasgst is c " + c);
        }
    }
}
