package ARRAYS;

public class SubArrays {

    public static void subArray(int arr[]) {
        int tSubArr = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                tSubArr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub-Arrays : " + tSubArr);
        System.out.println("The sum is : " + sum);

    }

    public static void subArr(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                }
                sum++;
                System.out.println();
            }
        }
        System.out.println("Total = " + sum);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        subArray(arr);

    }
}
