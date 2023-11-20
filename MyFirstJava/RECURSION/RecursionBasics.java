package RECURSION;

// Recursion is a method of solving a computational problem where the solution depends
// solutions to smaller instances of the same problem. 
// -> Base condition
// -> Some work
// -> Inner call
public class RecursionBasics {

    // print decreasing
    public static void decreasingNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decreasingNum(n - 1);
    }

    // print number in increasing order
    public static void increasingNum(int n) {
        if (n > 0) {
            increasingNum(n - 1);
            System.out.print(n + " ");
        }

    }

    // print factorial
    // time and space complexity :- O(n);
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    // print sum of first 'n' natural numbers

    public static int naturalSum(int n) {
        if (n == 1) {
            return 1;
        }

        int sumOfN_1 = naturalSum(n - 1);
        int sumOfN = n + sumOfN_1;
        return sumOfN;

        // return n + naturalSum(n - 1);
        // time and space complexity :- O(n);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // int finOfN_1 = fib(n - 1);
        // int finOfN_2 = fib(n - 2);
        // int finOfN = finOfN_1 + finOfN_2;
        // return finOfN;

        return fib(n - 1) + fib(n - 2);
    }

    // check array is sorted or not
    public static boolean isSorted(int arr[], int start) {
        if (start == arr.length - 1) {
            return true;
        }
        if (arr[start] > arr[start + 1]) {
            return false;
        }
        return isSorted(arr, start + 1);
    }

    public static void main(String[] args) {
        int num = 5;
        decreasingNum(num);
        System.out.println();
        increasingNum(num);
        System.out.println();
        System.out.println(factorial(num));
        System.out.println(naturalSum(num));
        System.out.println(fib(num));

        int arr[] = { 7, 8, 9 };
        System.out.println(isSorted(arr, 0));
    }

}
