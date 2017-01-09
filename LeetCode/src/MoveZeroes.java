

/*
283. Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements. 

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0]. 

Note:

1.You must do this in-place without making a copy of the array.
2.Minimize the total number of operations.

*/


public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int zeroIdx = 0;
		int zeroLen = 0;
		int numIdx = 0;
		int numLen = 0;
		while (zeroIdx < nums.length && numIdx < nums.length) {
			if (nums[zeroIdx] == 0) {
				zeroLen = 0;
				while (nums[zeroIdx + zeroLen + 1] == 0) {
					zeroLen++;
				}
				numIdx = zeroIdx + zeroLen + 1;
				while (numLen<zeroLen&&nums[numIdx + numLen + 1] != 0) {
					zeroLen++;
				}
				
				
			} else {
				zeroIdx++;
				continue;
				
			}

		}
	}
	
	public void swapByLength(int i, int j, int[] nums, int length) {
		for (int k = 0; k < length; k++) {
			int tmp = nums[j + k];
			nums[j + k] = nums[i + k];
			nums[i + k] = tmp;
		}
	}

}
