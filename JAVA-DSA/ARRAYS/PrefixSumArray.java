package ARRAYS;

public class PrefixSumArray {

    public static void sumArray(int arr[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        // calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                curSum = 0;
                // for (int k = i; k <= j; k++) {
                // curSum += arr[k];
                // System.out.print(arr[k] + " ");
                // }
                // System.out.println();
                // System.out.println("__");
                // System.out.println("the sum is : " + curSum);

                curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; // terninary operator is used here

                if (maxSum < curSum) {
                    // System.out.println("--");
                    maxSum = curSum;
                }
            }
            // System.out.println();
        }

        System.out.println("Max sum : " + maxSum);
    }

    // time comeplexity: O(n^2) , which is less than O(n^3);
    public static void main(String[] args) {

        int arr[] = { 10, 6, -4, -3 };

        sumArray(arr);

    }
}
