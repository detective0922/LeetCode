/*
64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers,
find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

*/
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int step = grid.length + grid[0].length;
        int[] dp = new int[step];
        dp[0] = grid[0][0];
        for (int i = 0; i < step; i++) {
            
        }
        return dp[step - 1];
    }
}
