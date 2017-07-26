/*
59. Spiral Matrix II

Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
 Given n = 3,
You should return the following matrix: [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]

*/
public class SpiralMatrixII {
    public static void main(String[] args) {
        new SpiralMatrixII().generateMatrix(3);
    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        fillMatrixBorder(matrix, 1, 0, 0, n, n * n);
        return matrix;
    }

    private void fillMatrixBorder(int[][] matrix, int startValue, int startRow, int startCol, int size, int max) {
        int row = startRow;
        int col = startCol;
        int value = startValue;
        int rowBorder = startRow + size;
        int colBorder = startCol + size;
        for (; col < colBorder; col++, value++) {
            matrix[row][col] = value;
        }
        col--;
        row++;
        for (; row < rowBorder; row++, value++) {
            matrix[row][col] = value;
        }
        row--;
        col--;
        for (; col >= startCol; col--, value++) {
            matrix[row][col] = value;
        }
        col++;
        row--;
        for (; row > startRow; row--, value++) {
            matrix[row][col] = value;
        }
        if (value <= max) {
            fillMatrixBorder(matrix, value, startRow + 1, startCol + 1, size - 2, max);
        }
    }

}
