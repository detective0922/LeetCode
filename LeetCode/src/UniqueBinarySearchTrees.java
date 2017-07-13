/*
96. Unique Binary Search Trees

Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
 Given n = 3, there are a total of 5 unique BST's.
   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

*/
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                dp[i] = dp[j-1] * dp[n-j];
            }
        }
        return dp[n];
    }
}
