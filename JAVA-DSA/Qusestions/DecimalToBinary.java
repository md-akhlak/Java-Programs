package Qusestions;

import java.util.Scanner;

public class DecimalToBinary {

    public static void decToBinary(int decNum) {

        int myNum = decNum;

        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum += (rem * Math.pow(10, pow));

            pow++;
            decNum /= 2;

        }

        System.out.println("Binary of " + myNum + " = " + binNum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal number : ");
        int decNum = sc.nextInt();

        decToBinary(decNum);

        sc.close();

    }
}
