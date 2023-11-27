package RECURSION;

// Recursion is a method of solving a computational problem where the solution depends
// solutions to smaller instances of the same problem. 
// -> Base condition
// -> Some work
// -> Inner call
public class RecursionBasics {

    // print decreasing
    public static void decreasingNum(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            decreasingNum(n - 1);
        }
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

    // first ouccurence
    public static int firstOuccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOuccurence(arr, key, i + 1);
    }

    // last ouccurence
    public static int lastOuccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOuccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // power using recursion , time complexity O(n);
    public static int power(int m, int n) {
        if (n == 0) {
            return 1;
        }

        // int x = power(m, n - 1);
        // int y = m * x;
        // return y;

        return power(m, n - 1) * m;
    }

    // optimised power using recursion , time complexity :- O(log(n));
    public static int optimisedPower(int m, int n) {
        if (n == 0) {
            return 1;
        }

        // for even scenarios
        // int halfpow = optimisedPower(m, n / 2);
        // int halfPowSq = halfpow * halfpow;
        // // for odd scenarios
        // if (n % 2 != 0) {
        // halfPowSq = m * halfPowSq;
        // }
        // return halfPowSq;

        if (n % 2 == 0) {
            return optimisedPower(m * m, n / 2);
        } else {
            return optimisedPower(m * m, (n - 1) / 2) * m;
        }

    }

    public static void tOH(int n, String A, String B, String C) {
        if (n == 0) {
            return;
        }
        tOH(n - 1, A, C, B);
        System.out.println(A + " -> " + C);
        tOH(n - 1, B, A, C);
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

        int arr[] = { 1, 2, 3, 4, 5, 7, 5, 5, 6, 7, 5, 2 };
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOuccurence(arr, 5, 0));
        System.out.println(lastOuccurence(arr, 5, 0));

        System.out.println(power(2, 5));
        System.out.println(optimisedPower(2, 10));

        tOH(3, "A", "B", "C");

    }

}
