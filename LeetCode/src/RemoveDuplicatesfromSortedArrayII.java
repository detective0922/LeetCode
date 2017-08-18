/*
80. Remove Duplicates from Sorted Array II

Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?

For example,
 Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
It doesn't matter what you leave beyond the new length.

*/
public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        new RemoveDuplicatesfromSortedArrayII().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        int dupCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j] || dupCount < 2) {
                nums[++j] = nums[i];
            } else {
                dupCount++;
                if (dupCount == 2) {
                    dupCount = 0;
                }
            }
        }
        return j + 1;

    }
}
