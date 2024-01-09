package ARRAYS;

public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            // swap elements of arrays
            // int temp = arr[last];
            // arr[last] = arr[first];
            // arr[first] = temp;

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;

        }
    }

    public static void reverse(int arr[]) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        display(arr);
        reverse(arr);
        System.out.println("The array in reverse order is ");
        display(arr);

    }
}
