package Questions;

public class BinarySearch {

    public static int binSearch(int arr[], int low, int high, int key) {
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int recBinSearch(int arr[], int low, int high, int key) {
        int mid = low + (high - low) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return recBinSearch(arr, mid + 1, high, key);
        } else {
            return recBinSearch(arr, low, high - 1, key);
        }
    }

    public static int binary(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                System.out.print("key found at index :");
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("element not found at any index");
        return -1;
    }

    public static int recBinary(int arr[], int start, int end, int key) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                System.out.print("Key found at index : ");
                return mid;
            } else if (key > arr[mid]) {
                return recBinary(arr, mid + 1, end, key);
            } else {
                return recBinary(arr, start, mid - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // System.out.println(binSearch(arr, 0, arr.length - 1, 5));

        // System.out.println(recBinSearch(arr, 0, arr.length - 1, 5));

        int arr2[] = { 2, 4, 12, 14, 17, 23, 25, 35, 41, 47 };

        System.out.println(binary(arr2, 25));
        System.out.println(recBinary(arr2, 0, arr.length - 1, 25));
    }
}
