package InteviewQuestions;

// Amazon , Google, Adobe , Microsoft, Apple etc...
public class SpiralMatrix {

    public static void spiralMatrix(int arr[][]) {
        int startRow = 0;
        int startcol = 0;
        int endRow = arr.length - 1;
        int endCol = arr.length - 1;

        while (startRow <= endRow && startcol <= endCol) {
            // top
            for (int j = startcol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // bottom
            for (int j = endRow - 1; j >= startcol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startcol == endCol) {
                    break;
                }
                System.out.print(arr[i][startcol] + " ");
            }

            startcol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();

    }

    public static void main(String[] args) {

        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        spiralMatrix(mat);

    }

}
