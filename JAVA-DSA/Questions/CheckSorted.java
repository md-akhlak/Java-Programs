package Questions;

import java.util.Arrays;

public class CheckSorted {
    public static int sorted(int arr[], int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return 0;
        }
        return sorted(arr, n - 1);
    }

    public static int duplicate(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int tempArr[] = new int[n];
        int j = 0;

        for (int i = 0; i < tempArr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                tempArr[j++] = arr[i];
            }
        }

        for (int i = 0; i < j; i++) {
            arr[i] = tempArr[i];
        }
        return j;
    }

    public static int secondLargest(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[n - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        // System.out.println(sorted(arr, arr.length));

        if ((sorted(arr, arr.length)) != 0) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("Not sorted");
        }

        int arr2[] = { 3, 5, 1, 2, 7, 8, 9, 10, 2 ,33};

        int n = duplicate(arr2, arr.length - 1);

        // System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println(secondLargest(arr, arr.length));
        System.out.println(secondLargest(arr2, arr.length));

    }
}
