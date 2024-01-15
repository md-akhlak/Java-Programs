package Questions;

import java.util.*;

public class ReplaceOldWithNew {

    public static void displayt(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 2, 4, 7, 9, 9, 0, 0, 1, 2, 6, 7, 2 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter old element");
        int old = sc.nextInt();
        System.out.println("Enter new element");
        int newEle = sc.nextInt();

        // System.out.println("Origianl array : " + Arrays.toString(arr));
        displayt(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == old) {
                arr[i] = newEle;
            }
        }

        displayt(arr);
        // System.out.println("modified array : " + Arrays.toString(arr));

    }
}
