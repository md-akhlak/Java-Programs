package ARRAYS;

public class MaxSubArrSum {

    public static void sumArray(int arr[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                curSum = 0;
                for (int k = i; k <= j; k++) {
                    curSum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                System.out.println("__");
                System.out.println("the sum is : " + curSum);

                if (maxSum < curSum) {
                    // System.out.println("--");
                    maxSum = curSum;
                }
            }
            System.out.println();
        }

        System.out.println("Max sum : " + maxSum);
    }

    // time-complexity : O(n^3); -> it is brute force and worst time complexity
    public static void main(String[] args) {

        int arr[] = { 10, 6, -4, -3 };

        sumArray(arr);

    }
}
