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
        boolean[] rowZeros = new boolean[matrix.length];
        boolean[] colZeros = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowZeros[i] =
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = copyMatrix[i][j];
            }
        }
    }
}
