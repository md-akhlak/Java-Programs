package Divide_and_Conquer;

// Average time complexity :- O(log(n))
// Word time complexity :- O(n^2)
// space complexity :- O(1)
public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    // worst case time complexity when pivot is last element the array is sorted
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[si];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static int part(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;

        do {
            do {
                i++;
            } while (i <= pivot);

            do {
                j--;
            } while (j > pivot);

            if (i < j) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        } while (i < j);

        // swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return j;

    }

    public static void sort(int arr[], int l, int h) {
        int pivIndex;
        if (l < h) {
            pivIndex = part(arr, l, h);
            sort(arr, l, pivIndex);
            sort(arr, pivIndex + 1, h);
        }

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 3, 4, 2, 4, 6, 7, 9, 3, 2 };
        quickSort(arr, 0, arr.length - 1);
        // sort(arr, 0, arr.length - 1);
        display(arr);
    }
}
