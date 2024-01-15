package Questions;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPOs = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPOs] > arr[j]) {
                    minPOs = j;
                }
            }
            int temp = arr[minPOs];
            arr[minPOs] = arr[i];
            arr[i] = temp;
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPOs = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPOs] > arr[j]) {
                    minPOs = j;
                }
            }
            int temp = arr[minPOs];
            arr[minPOs] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 2, 4, 1, 3 };
        int arr2[] = { 15, 32, 27, 31, 8, 11 };
        selection(arr2);
        display(arr2);
    }
}
