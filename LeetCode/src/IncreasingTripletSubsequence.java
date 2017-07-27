/*
334. Increasing Triplet Subsequence

Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:


Return true if there exists i, j, k
 such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.


Your algorithm should run in O(n) time complexity and O(1) space complexity.

Examples:
 Given [1, 2, 3, 4, 5],
 return true.

Given [5, 4, 3, 2, 1],
 return false.

*/
public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        new IncreasingTripletSubsequence().increasingTriplet(new int[]{2,5,3,4,5});
    }
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            } else if (nums[i] <= secondMin) {
                secondMin = nums[i];
            } else {
                return true;
            }
        }
        return false;

    }
}
