package ARRAYS;

public class Kadane_sAlgorithm {

    public static void kadanesSum(int arr[]) {
        // The line `int maxSum = Integer.MIN_VALUE;` is initializing the variable
        // `maxSum` with the
        // minimum possible value for an integer. This is done to ensure that the
        // initial value of
        // `maxSum` is smaller than any possible sum of elements in the array.
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum < 0) {
                curSum = 0;
            }
            // The line `maxSum = Math.max(curSum, maxSum);` is comparing the current sum
            // (`curSum`)
            // with the maximum sum (`maxSum`) seen so far. It assigns the larger value
            // between the two
            // to `maxSum`.
            maxSum = Math.max(curSum, maxSum);
        }
        System.out.println("the current sum is " + curSum);
        System.out.println("the max sum is : " + maxSum);
    }

    // time complexity : O(n); -> big-O(n)
    public static void main(String[] args) {

        int arr[] = { -2, -10, 4, 5, 6, -1, -3 };
        kadanesSum(arr);
    }
}
