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
        new SetMatrixZeroes().setZeroes(new int[][]{{1,1,1,1},{2,2,0,2},{3,3,3,3},{4,4,4,4}});
    }

    public void setZeroes(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        int[][] copyMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    fillZero(copyMatrix, i, j);
                } else {
                    copyMatrix[i][j] = matrix[i][j];
                }
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
