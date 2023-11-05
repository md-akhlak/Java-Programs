package ARRAYS;

import java.util.Arrays;
// import java.util.Collections;

public class InbuiltSortInJava {

    public static void displayArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Integer arr[] = { 3, 2, 4, 1, 5 };

        displayArray(arr);
        System.out.println();
        Arrays.sort(arr); // by default accending sort order
        displayArray(arr);
        // particular sort
        // System.out.println();
        // Arrays.sort(arr, 0, 3);
        // displayArray(arr);
        // for decending sort order -> for this we change the (int) to (Integer);
        // Arrays.sort(arr, Collections.reverseOrder());
        // displayArray(arr);
        // System.out.println();
        // particular sort
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        // displayArray(arr);

    }
}
