package Questions;

import java.util.*;

public class Matrix {

    public static void inputMatrix(int mat[][]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void outputMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean searchMatrix(int mat[][], int key) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (key == mat[i][j]) {
                    System.out.println("key found at index " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;

    }

    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        inputMatrix(mat);
        outputMatrix(mat);
        searchMatrix(mat, 4);
    }
}
