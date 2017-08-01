/*
64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers,
find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

*/
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[] currCol = new int[m];
        for (int i = 1; i < m; i++) {
            currCol[i] = currCol[i-1] + grid[0][i];
        }
        for (int i = 1; i < n; i++) {
            currCol[0] += grid[i][0];
            for (int j = 1; j < m; j++) {
                currCol[j] = Math.min(currCol[j-1], currCol[i]) + grid[i][j];
            }
        }
        return currCol[m-1];
    }
}
