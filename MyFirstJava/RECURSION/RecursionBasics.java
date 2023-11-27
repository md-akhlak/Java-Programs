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

        if (n == 0) {
            return 0;
        }
        return naturalSum(n - 1) + n;

        // if (n == 1) {
        // return 1;
        // }

        // int sumOfN_1 = naturalSum(n - 1);
        // int sumOfN = n + sumOfN_1;
        // return sumOfN;

        // return n + naturalSum(n - 1);
        // time and space complexity :- O(n);
    }

    // fibonacci
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

    // fibonacci using loop
    public static int fibUseLoop(int n) {
        int t0 = 0;
        int t1 = 1;
        int sum = 0;
        if (n <= n) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            sum = t0 + t1;
            t0 = t1;
            t1 = sum;
        }
        return sum;
    }

    // memoization funtion for finding the fibonacci
    public static int memoizationFib(int n) {
        int arr[] = new int[10];
        if (n <= 1) {
            arr[n] = n;
            return 1;
        } else {
            if (arr[n - 2] == -1) {
                arr[n - 2] = memoizationFib(n - 2);
            }
            if (arr[n - 1] == -1) {
                arr[n - 1] = memoizationFib(n - 1);
            }
            return arr[n - 2] + arr[n - 1];
        }
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

    // nested recursion
    public static int nestedRecursion(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return nestedRecursion(nestedRecursion(n + 11));
        }
    }

    // taylor series
    public static double taylorSeries(int x, int n) {
        double p = 1;
        double f = 1;
        double r;
        if (n == 0) {
            return 1;
        } else {
            r = taylorSeries(x, n - 1);
            p = p * x;
            f = f * n;
            return (r + p / f);
        }
    }

    // Tower of hanoi
    public static void tOH(int n, String A, String B, String C) {
        if (n == 0) {
            return;
        }
        tOH(n - 1, A, C, B);
        System.out.println(A + " -> " + C);
        tOH(n - 1, B, A, C);
    }

    // Driver function
    public static void main(String[] args) {

        int num = 5;
        System.out.print("Decreasing : ");
        decreasingNum(num);

        System.out.println();

        System.out.print("Increasing: ");
        increasingNum(num);
        System.out.println();

        System.out.println("factorail : " + factorial(num));

        System.out.println("sum of natural num: " + naturalSum(num));

        System.out.println("fib: " + fib(num));

        System.out.println("fib using loop: " + fibUseLoop(num));

        System.out.println("Fib using memoization: " + memoizationFib(5));

        int arr[] = { 1, 2, 3, 4, 5, 7, 5, 5, 6, 7, 5, 2 };

        System.out.println("Check Sorted: " + isSorted(arr, 0));

        System.out.println("First Occurance: " + firstOuccurence(arr, 5, 0));

        System.out.println("Last occurence: " + lastOuccurence(arr, 5, 0));

        System.out.println("Power: " + power(2, 5));

        System.out.println("Find power: " + optimisedPower(2, 10));

        System.out.println("Nested Recursion: " + nestedRecursion(95));

        System.out.println("Taylor series: " + taylorSeries(1, 10));

        System.out.println("Tower of Hanoi");
        tOH(3, "A", "B", "C");

    }

}
