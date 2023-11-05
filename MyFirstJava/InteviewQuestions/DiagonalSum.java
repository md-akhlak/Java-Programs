package InteviewQuestions;

// Microsoft , Amazon , Samsung, and other companies
public class DiagonalSum {
    // this is brute method for diagonal sum , its time complexity is : O(n^2) or
    // Big-O(n^2)
    public static int diagonalSum(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    // Optimised method for calculating diagonal sum , its time complexity is :
    // O(n) or Big-O(n);
    public static int addDiagonal(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            // primary diagonal
            sum += mat[i][i];
            // Secondary diagonal
            if (i != mat.length - 1)
                sum += mat[i][mat.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {

        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println();
        System.out.println(diagonalSum(mat));
        System.out.println();
        System.out.println(addDiagonal(mat));
    }
}
