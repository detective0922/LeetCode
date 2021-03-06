/*

153. Find Minimum in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

*/
public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(new FindMinimuminRotatedSortedArray().findMin(nums));
    }

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] < nums[high]) {
                break;
            }
            int mid = low + (high - low) / 2;
            if(nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
