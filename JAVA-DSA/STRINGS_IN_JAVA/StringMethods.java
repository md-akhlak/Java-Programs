package STRINGS_IN_JAVA;

import java.util.Scanner;

public class StringMethods {

    public static void charAtString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

    }

    // check palindrome
    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("not palindrome" + str);
                return false;
            }
        }
        System.out.println("Palindrome : " + str);
        return true;

    }

    // substring in java

    public static String substring(String str, int start, int end) {
        String subString = "";
        for (int i = start; i < end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "Md Akhlak";
        // length of the string
        System.out.println(name.length());

        String firname = "md";
        String lstname = "akhlak";
        // stings concataniction
        String fname = firname + lstname;
        System.out.println(fname);

        // charAt() -> print character at given position
        charAtString(fname);

        // check String is palindrome or not
        isPalindrome(lstname);

        // check string equal or not

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("String is equal");
        } else {
            System.out.println("Sting not equal");
        }

        // .equals()

        if (s1.equals(s3)) {
            System.out.println("String is equal");
        } else {
            System.out.println("Sting not equal");
        }

        // substring is java
        String sub = "Hello, world!";

        System.out.println(substring(sub, 0, 5));

        // by default substring in java

        String s = "Hello, world!";
        System.out.println(s.substring(0, 5));

        // print largest string

        String fruit[] = { "banana", "orange", "apple", "mango" };

        String largest = fruit[0];

        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }

        // time complexity :O(x*n);
        System.out.print("Largest fruit: " + largest);

        sc.close();

    }
}
