package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void insertElement(int arr[], int size, int index, int ele) {
        for (int i = size - 1; i >= index - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = ele;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements you want in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        System.out.println("Enter the elements of an array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before inserting ");

        display(arr);
        // System.out.println(Arrays.toString(arr));

        System.out.print("Enter the index where ele you want to insert : ");
        int index = sc.nextInt();

        System.out.print("Enter the element you want to insert : ");
        int element = sc.nextInt();

        System.out.println("After inserting ");

        insertElement(arr, n, index, element);

        display(arr);
        // System.out.println(Arrays.toString(arr));

        sc.close();

        // int arr2[] = { 2, 4, 5, 7, 9 };
        // insertElement(arr2, arr2.length - 1, 2, 12);
        // display(arr2);

    }
}
