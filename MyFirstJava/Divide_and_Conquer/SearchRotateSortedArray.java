package Divide_and_Conquer;

public class SearchRotateSortedArray {

    public static int searchArray(int arr[], int start, int end, int key) {

        int mid = start + (end - start) / 2;

        if (start > mid) {
            return -1;
        }

        // if (start <= end) {

        if (key == arr[mid]) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {

            if (arr[start] <= key && key <= arr[mid]) {
                return searchArray(arr, start, mid - 1, key);
            } else {
                return searchArray(arr, mid + 1, end, key);
            }
        }

        else {

            if (arr[mid] <= key && key <= arr[end]) {
                return searchArray(arr, mid + 1, end, key);
            } else {
                return searchArray(arr, start, mid - 1, key);
            }
        }
        // }
        // return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 9, 0, 1, 3, 4 };

        int target = searchArray(arr, 0, arr.length - 1, 99);
        System.out.println(target);

        System.out.println(searchArray(arr, 0, arr.length - 1, 4));

    }
}
