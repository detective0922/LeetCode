
/*
75. Sort Colors

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent,
with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
 You are not suppose to use the library's sort function for this problem.

click to show follow up.


Follow up:
 A rather straight forward solution is a two-pass algorithm using counting sort.
 First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's,
 then 1's and followed by 2's.

Could you come up with an one-pass algorithm using only constant space?

*/
public class SortColors {
    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{2,1});
    }

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        /*int i = 0;
        int j = 0;
        int color = 0;
        while (i < nums.length) {
            if (nums[i] == color) {
                i++;
                j++;
            } else {
                for (j++; j < nums.length; j++) {
                    if (nums[j] == color) {
                        swap(nums, i, j);
                        i++;
                        break;
                    }
                }
                if (j >= nums.length - 1) {
                    color++;
                    j = i;
                }
            }
        }*/
        int low = 0;
        int high = nums.length-1;
        for(int i = low; i<=high;) {
            if(nums[i]==0) {
                swap(nums,i, low);
                i++;low++;
            }else if(nums[i]==2) {
                swap(nums, i, high);
                high--;
            }else {
                i++;
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
