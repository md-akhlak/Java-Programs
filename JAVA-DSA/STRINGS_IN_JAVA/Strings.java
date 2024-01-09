package STRINGS_IN_JAVA;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = "Md Akhlak";
        // System.out.println(name);

        // System.out.println("Enter name: ");
        // String str = sc.next();
        // System.out.println(str);

        System.out.println("Enter full name: ");
        String name = sc.nextLine();
        System.out.println(name);

        sc.close();

    }
}
