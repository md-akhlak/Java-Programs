package SORTING;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // increasing sort order
                if (arr[j] > arr[j + 1]) { // decreasing sort order -> if(arr[j] < arr[j + 1]);
                    // SWAP
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // display the result
    public static void displayResult(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // time complexity : O(n^2) or big-O(n^2);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // enter the input array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index : " + i + " ");
            arr[i] = sc.nextInt();
        }
        displayResult(arr);
        System.out.println();
        bubbleSort(arr);
        displayResult(arr);
        

        sc.close();
    }
}
