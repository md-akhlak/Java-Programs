package SORTING;

public class Merge_Sort {


    // static void mergingSort(int arr[], int start, int end) {
    // if (start >= end) {
    // return;
    // }
    // int mid = start + (end - start) / 2;

    // // work
    // mergingSort(arr, start, mid);
    // mergingSort(arr, mid + 1, end);
    // merging(arr, end, mid, mid);
    // }

    // public static void merging(int arr[], int start, int mid, int end) {
    // int temp[] = new int[end - start + 1];
    // int i = start;
    // int j = mid + 1;
    // int k = 0;
    // while (i <= mid && j <= end) {
    // if (arr[i] < arr[j]) {
    // temp[k] = arr[i];
    // i++;
    // } else {
    // temp[k] = arr[j];
    // }
    // k++;
    // }

    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }

    // while (j <= end) {
    // temp[k++] = arr[j++];
    // }

    // for (k = 0, i = start; k < temp.length; k++, i++) {
    // arr[i] = temp[k];
    // }
    // }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // work
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei);
    }

    // merge function
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp arr to original arr;
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    // time complexity :- O(nlog(n))
    // space complexity :- O(n)

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {9, 3, 4, 1, 6, 5, 8, 7, 2, -3, -5};
        mergeSort(arr, 0, arr.length - 1);
        displayArray(arr);

        System.out.println();

        // mergingSort(arr, 0, arr.length - 1);
        // displayArray(arr);
    }
}


