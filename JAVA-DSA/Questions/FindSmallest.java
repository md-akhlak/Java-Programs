package Questions;

public class FindSmallest {
    public static int geMin(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], geMin(arr, n - 1));
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 7, 2, 6, 8, 1 };
        System.out.println(geMin(arr, arr.length));
    }
}
