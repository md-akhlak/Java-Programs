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

        int mat[][] = new int[3][3];

        matrixInput(mat);
        matrixOutput(mat);
        searchElements(mat, 6);

    }
}
