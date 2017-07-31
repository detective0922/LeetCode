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
        int[] dp = new int[m + n];
        dp[0] = grid[0][0];
        int i = 0;
        int j = 0;
        int step = 0;
        while (i < m || j < n) {
            int currVal = 0;
            if (grid[i][j + 1] > grid[i + 1][j]) {
                j++;
                currVal = grid[i + 1][j];
            } else if (grid[i][j + 1] < grid[i + 1][j]) {
                i++;
                currVal = grid[i][j + 1];
            }
            step++;
            dp[step] = dp[step-1] + currVal;
        }
        return dp[m + n - 1];
    }
}
