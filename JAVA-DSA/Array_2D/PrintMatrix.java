package Array_2D;

import java.util.Scanner;

public class PrintMatrix {

    // input matrix
    public static void matrixInput(int mat[][]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        s.close();
    }

    // matrix output
    public static void matrixOutput(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // search elements in the matrix
    public static boolean searchElements(int mat[][], int key) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == key) {
                    System.out.println("key found at index : (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found at any index");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int column = sc.nextInt();

        // int mat[][] = new int[row][column];

        // matrixInput(mat);
        // matrixOutput(mat);
        // searchElements(mat, 6);

        int matrix[][] = new int[row][column];
        int zeros = 0;

        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0)
                    zeros++;
            }
        }

        matrixOutput(matrix);

        if (zeros > (row * column) / 2) {
            System.out.println("The matrix is sparse matrix");
        } else {
            System.out.println("The matrix is not sparse matrix");
        }

        sc.close();

    }
}
