/*

48. Rotate Image

You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
 Could you do this in-place?

*/
public class RotateImage {
    public static void main(String[] args) {
        new RotateImage().rotate(new int[][]{{1,2},{3,4}});
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i< n / 2; i++) {
            for (int j = i; j < n - i - 1; j++ ) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j -1][i];
                matrix[n - j -1][i] = matrix[n - i -1][n - j -1];
                matrix[n - i -1][n - j -1] = matrix[j][n - i -1];
                matrix[j][n - i -1] = temp;
            }
        }
    }
}
