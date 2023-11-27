package ARRAYS;

public class PrintPairsInArray {

    public static void pairsArray(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + "), ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + totalPairs);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 ,7};
        pairsArray(arr);

    }
}
