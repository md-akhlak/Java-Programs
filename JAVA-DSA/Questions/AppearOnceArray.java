package Questions;

import java.util.Arrays;

public class AppearOnceArray {

    public static void print(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {2, 1, 4, 5, 5, 7, 8, 10, 10, 4};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int key = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j && key == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
