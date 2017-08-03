/*
300. Longest Increasing Subsequence

Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
 Given [10, 9, 2, 5, 3, 7, 101, 18],
 The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4.
 Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?


*/
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        /*int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            int dpMax = 0;
            for (int j = 0; j < i; j++) {
                if (dp[j] > dpMax & nums[j] < nums[i]) {
                    dpMax = dp[j];
                }
            }
            dp[i] = dpMax + 1;
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;*/

        int[] tails = new int[nums.length];
        int maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > tails[i-1]) {
                tails[i-1] = nums[i];
            }
            if (nums[i] < tails[0]) {
                tails[0] = nums[i];
            }
            int low = 0;
            int high = i-1;
            while (low < high) {

            }
            tails[low] = nums[i];

        }
        return maxLength;
    }
}
