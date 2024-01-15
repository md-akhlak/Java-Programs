package Questions;

// import java.util.*;

public class CountSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sort

        int update = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[update] = i;
                update++;
                count[i]--;
            }
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 1, 6, 8, 3, 3, 4, 2, 5, 9, 5, 6 };
        countingSort(arr);
        display(arr);
    }
}
