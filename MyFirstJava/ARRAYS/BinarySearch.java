package ARRAYS;

public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // comparision
            if (key == arr[mid]) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // Time complesity : O(log n)
        return -1;
    }

    public static int binSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, };

        System.out.println("The index for key is : " + binarySearch(arr, 7)); //

        System.out.println("The index for key is : " + binSearch(arr, 10));

    }
}
