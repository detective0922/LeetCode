/*
64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers,
find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

*/
public class MinimumPathSum {
    public static void main(String[] args) {
        new MinimumPathSum().minPathSum(new int[][]{{1,2,5},{3,2,1}});
    }
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
        for (int j = 1; j < n; j++) {
            currCol[0] += grid[0][j];
            for (int i = 1; i < m; i++) {
                currCol[i] = Math.min(currCol[i-1], currCol[i]) + grid[i][j];
            }
        }
        return currCol[m-1];
    }
}
