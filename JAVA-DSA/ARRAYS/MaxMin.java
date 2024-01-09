package ARRAYS;

// import java.util.*;

public class MaxMin {
    public static int max(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value : " + smallest);
        System.out.print("Largest value is : ");
        return largest;
    }

    // time complexity O(n); or bigO(n);
    public static void main(String[] args) {
        int number[] = { 234, 2, 3, 4, 95, 6, 7, 8 };

        System.out.println(max(number));
    }
}
