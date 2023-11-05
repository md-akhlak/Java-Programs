package SORTING;

import java.util.Scanner;

public class SelectionSort {

    public static void selctionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    // display the result
    public static void displayResult(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // time complexity : O(n^2); or big-O of n^2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        int l = sc.nextInt();

        int arr[] = new int[l];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element  at index : " + i + " ");
            arr[i] = sc.nextInt();
        }

        // print
        displayResult(arr);
        System.out.println();
        selctionSort(arr);
        displayResult(arr);
        sc.close();

    }
}
