package Questions;

public class LinearSearch {

    static int linerSearch(int arr[], int key) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int linear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("the key : " + key);
                System.out.print("found at :");
                return i;
            }
        }
        System.out.println("key not found");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 1, 4, 8, 9, 33, 11, 5, 7, 10, 47 };
        System.out.println(linear(arr2, 22));
    }
}
