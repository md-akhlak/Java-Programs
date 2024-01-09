package InteviewQuestions;

// Oracle 
public class SearchEleInSortedMat {
    // brute force , and its time complexity : O(n^2) or Big-O(n^2)
    public static boolean searchMat(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("key found " + key);
                    return true;
                }
            }
        }

        System.out.println("key not found " + key);
        return false;
    }

    // optimised search algorithm
    public static boolean stairSearchMatrix(int mat[][], int key) {
        int row = 0;
        int col = mat[0].length - 1;

        while (row < mat.length && col >= 0) {
            if (mat[row][col] == key) {
                System.out.println("Key " + key + " found at index (" + row + "," + col + ")");
                return true;
            } else if (key < mat[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;

    }

    public static void main(String[] args) {

        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // System.out.println(searchMat(mat, 12));
        System.out.println(stairSearchMatrix(mat, 7));

    }
}
