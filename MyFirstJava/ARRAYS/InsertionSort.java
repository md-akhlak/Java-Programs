package ARRAYS;

public class InsertionSort {

    public static void insertinSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;

        }

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    // time complexity : O(n^2) or big-O(n^2);

    public static void main(String[] args) {

        int arr[] = { 4, 2, 3, 1, 5 };
        insertinSort(arr);
        display(arr);

    }
}
