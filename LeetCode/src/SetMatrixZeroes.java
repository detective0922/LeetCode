/*

73. Set Matrix Zeroes

Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

click to show follow up.

Follow up:
Did you use extra space?
 A straight forward solution using O(mn) space is probably a bad idea.
 A simple improvement uses O(m + n) space, but still not the best solution.
 Could you devise a constant space solution?

*/
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1}};
        new SetMatrixZeroes().setZeroes(matrix);
        System.out.println(matrix);
    }

    public void setZeroes(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        int[][] copyMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < copyMatrix.length; i++) {
            for (int j = 0; j < copyMatrix[0].length; j++) {
                copyMatrix[i][j] = -1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    fillZero(copyMatrix, i, j);
                } else if (copyMatrix[i][j] == 0) {
                    continue;
                } else {
                    copyMatrix[i][j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = copyMatrix[i][j];
            }
        }
    }

    private void fillZero(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }

    }
}
