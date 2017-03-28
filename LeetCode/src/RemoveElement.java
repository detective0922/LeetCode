
/*
27. Remove Element

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
 Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

*/

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int notValIndex = nums.length - 1;
        while(index < notValIndex) {
            while (nums[index] !=val){
                index++;
            }
            while (nums[notValIndex]==val){
                notValIndex--;
            }

        }
    }

    public void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
