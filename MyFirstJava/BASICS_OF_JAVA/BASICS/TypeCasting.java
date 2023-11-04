package BASICS_OF_JAVA.BASICS;

import java.util.Scanner;

// it is also called Narrowing conversion or Explicit conversion , it cause lossy conversion

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = 354.24f;
        int b = (int) a;

        System.out.println(b);

        char ch = 'a';
        int num = ch;

        System.out.println(num);

        byte x = 10;
        x = (byte) (x * 2);
        System.out.println(x);

        sc.close();

    }

}
