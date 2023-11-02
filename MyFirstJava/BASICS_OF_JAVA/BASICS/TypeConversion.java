package BASICS_OF_JAVA.BASICS;

import java.util.Scanner;
import java.util.*;

// It is also called Implicit conversion
public class TypeConversion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        /*
        Conversion happens when :
        a- type compatible
        b- destination type > source type


        byte->short->int->float->long->double.  // stored in -> arrow type

        */

        System.out.println("enter number  ");

        float f = sc.nextInt();

        System.out.println(f);

    }
}
