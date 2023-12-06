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

    // using binary search
    public static int recBinSearch(int arr[], int start, int end, int key) {
        int mid = start + (end - start) / 2;

        if (start <= end) {

            if (key == arr[mid]) {
                return mid;
            }
            if (key > arr[mid]) {
                return recBinSearch(arr, mid + 1, end, key);
            } else {
                return recBinSearch(arr, start, mid - 1, key);
            }
        }
        return 99;
    }

    
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("The index for key is : " + binarySearch(arr, 7));

        System.out.println("Binary Search using recursion : " + recBinSearch(arr, 0, arr.length - 1, 88));

    }
}
