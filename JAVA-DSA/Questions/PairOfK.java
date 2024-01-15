package Questions;

public class PairOfK {
    public static void pairMultiple(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] * arr[j]) == target) {
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3, 2, 1, 5, 6, 7, 4, 4, 8, 3, 16 };
        pairMultiple(arr, 16);

    }
}
