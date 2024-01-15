package STRINGS_IN_JAVA;

import java.util.Comparator;
import java.util.Scanner;

public class Strings {
    public static int maximumProduct (int[] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        for(int n : nums){
            if(n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if (n > max2){
                max3 = max2;
                max2 = n;
            }else if( n > max3){
                max3 = n;
            }

            if(n < min1){
                min2 = min1;
                min1 = n;
            }else if( n < min2){
                min2 = n;
            }
        }

        return  Math.max(max1*max2*max3, max1*min1*min2);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = "Md Akhlak";
        // System.out.println(name);

        // System.out.println("Enter name: ");
        // String str = sc.next();
        // System.out.println(str);

//        System.out.println("Enter full name: ");
//        String name = sc.nextLine();
//        System.out.println(name);
//
//        sc.close();
//
        int arr[] = {3,1,7,0,5,4};
        System.out.println(maximumProduct(arr));


    }
}
