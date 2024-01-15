package Questions;

// public class Matrics {

//     public static void setDigonal(int mat[], int i, int j, int k) {
//         if (mat[i] == mat[j]) {
//             mat[i - 1] = k;
//         }
//     }

//     public static int getDigonal(int mat[], int i, int j) {
//         if (mat[i] == mat[j]) {
//             return mat[i - 1];
//         } else {
//             return 0;
//         }
//     }

//     public static void displayMat(int mat[][]) {
//         for (int i = 0; i < mat.length; i++) {
//             for (int j = 0; j < mat[0].length; j++) {
//                 if (i == j) {
//                     System.out.print(mat[i] + " ");
//                 } else {
//                     System.out.println(0);
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {

//     }
// }

import java.util.Scanner;

public class Matrics {

    private static int[][] inputSparseMatrix(int rows, int columns, Scanner scanner) {
        System.out.print("Enter the number of non-zero elements: ");
        int nonZeroCount = scanner.nextInt();

        int[][] sparseMatrix = new int[nonZeroCount][3];

        System.out.println("Enter non-zero elements (row, column, value):");
        for (int i = 0; i < nonZeroCount; i++) {
            sparseMatrix[i][0] = scanner.nextInt(); // Row index
            sparseMatrix[i][1] = scanner.nextInt(); // Column index
            sparseMatrix[i][2] = scanner.nextInt(); // Element value
        }

        return sparseMatrix;
    }

    private static void printSparseMatrix(int[][] sparseMatrix) {
        for (int i = 0; i < sparseMatrix.length; i++) {
            System.out.println(sparseMatrix[i][0] + "\t" + sparseMatrix[i][1] + "\t" + sparseMatrix[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input the sparse matrix
        int[][] sparseMatrix = inputSparseMatrix(rows, columns, scanner);

        // Print the sparse matrix
        System.out.println("Sparse Matrix:");
        printSparseMatrix(sparseMatrix);
    }

}
