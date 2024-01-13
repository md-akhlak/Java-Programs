package ARRAYS;

import java.util.Arrays;

public class MedianOfSortedArray {

    public static double mergedArrays(int arr1[], int arr2[]) {

        int m = arr1.length;
        int n = arr2.length;


        int mergedLength = m + n;
        int merged[] = new int[mergedLength];
        int k = 0;
        for (int i = 0; i < m; i++) {
            merged[k++] = arr1[i];
        }

        for (int j = 0; j < n; j++) {
            merged[k++] = arr2[j];
        }

        Arrays.sort(merged);

        int total = merged.length;
        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            int mid1 = merged[total / 2 - 1];
            int mid2 = merged[total / 2];
            return (double) (mid1 + mid2) / 2.0;
        }


    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 5, 7, 9};
        int arr2[] = {3, 6, 8, 10};

        double merged = mergedArrays(arr1, arr2);

        System.out.println(merged);


    }


}
