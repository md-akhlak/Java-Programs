package Questions;

public class RemoveDuplicates {

    public static int removeDup(int arr[]) {
        int n = arr.length;

       

        int temp[] = new int[n];

        int dup = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                // The line `temp[dup++] = arr[i];` is assigning the value of `arr[i]` to the next
                // available position in the temporary array `temp`.
                temp[dup++] = arr[i];
            }
        }

        // The line `temp[dup++] = arr[arr.length - 1];` is assigning the last element of the original
        // array `arr` to the next available position in the temporary array `temp`.
        temp[dup++] = arr[n - 1];

        for (int i = 0; i < dup; i++) {
            // The line `arr[i] = temp[i];` is assigning the value of `temp[i]` to the corresponding
            // position in the original array `arr`. This is done to update the original array with the
            // non-duplicate elements from the temporary array.
            arr[i] = temp[i];
        }

        return dup;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 2, 4, 5, 5, 7, 8, 9, 9, 10 };
        int k = arr.length;
        k = removeDup(arr);
        // int n = removeDup(arr, arr.length);

        // System.out.println(removeDup(arr, arr.length));
        // The line `for (int i = 0; i < k; i++) {` is a for loop that iterates over the array `arr`
        // from index 0 to index `k-1`. It is used to print the elements of the array after removing
        // duplicates.
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
