package ARRAYS;

public class BinarySearch {

    public static int binarySearch(int arr[], int l, int h, int key) {
        int mid;
        while (l <= h) {
            mid = (l + h) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println(binarySearch(arr, 1, arr.length - 1, 6));

    }
}
