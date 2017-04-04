/*
26. Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

*/
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int j = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=nums[j]){
                j++;
                swap(nums,i,j);
            }
        }
        return j;
    }

    public void swap(int[] array, int index1, int index2) {
        if (index1 == index2){
            return;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
