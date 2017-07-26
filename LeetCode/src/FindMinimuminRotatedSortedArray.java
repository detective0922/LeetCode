/*

153. Find Minimum in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

*/
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int prevMidNum = Integer.MIN_VALUE;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(mid > 0 && mid < nums.length - 1) {
                if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                    return nums[mid];
                } else if (nums[mid] > prevMidNum) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            prevMidNum = mid;
        }
        return nums[low];
    }
}
