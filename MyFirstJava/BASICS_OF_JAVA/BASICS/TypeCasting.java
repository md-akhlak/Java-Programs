package BASICS_OF_JAVA.BASICS;

import java.util.Scanner;
import java.util.StringTokenizer;

// it is also called Narrowing conversion or Explicit conversion , it cause lossy conversion

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = "My name is md akhkak";

        StringTokenizer tokenizer = new StringTokenizer(sentence);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

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
