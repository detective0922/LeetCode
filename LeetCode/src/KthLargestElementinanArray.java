/*
215. Kth Largest Element in an Array

Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
 Given [3,2,1,5,6,4] and k = 2, return 5.

Note:
 You may assume k is always valid, 1 ? k ? array's length.

*/

public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int j = partition(nums, low, high);
        }


        return nums[k];
    }

    private int partition(int[] nums, int low, int high) {
        int i = low + 1;
        int j = high;
        int pivot = nums[low];
        while (i<=j) {
            while (nums[i++] < pivot) {
                if (i == high) {
                    break;
                }
            }
            while (nums[j--] > pivot) {
                if (j == low) {
                    break;
                }
            }
            swap(nums, i, j);
        }
        swap(nums, low, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
