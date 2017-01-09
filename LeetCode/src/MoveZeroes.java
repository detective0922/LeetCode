

/*
283. Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements. 

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0]. 

Note:

1.You must do this in-place without making a copy of the array.
2.Minimize the total number of operations.

*/


public class MoveZeroes {
	
	public static void main(String[] args) {
		//int[] test = { 0, 1, 0, 3, 12 };
		int[] test = { 0, 0, 3};
		new MoveZeroes().moveZeroes(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + ",");
		}
		System.out.println();
	}

	public void moveZeroes(int[] nums) {
		int zeroIdx = 0;
		int zeroLen = 0;
		int numIdx = 0;
		int numLen = 0;
		while (zeroIdx < nums.length - 1 && numIdx < nums.length - 1) {
			if (nums[zeroIdx] == 0) {
				zeroLen = 1;
				while (nums[zeroIdx + zeroLen] == 0) {
					zeroLen++;
					if (zeroIdx + zeroLen >= nums.length) {
						return;
					}
				}
				numIdx = zeroIdx + zeroLen;
				while (numLen < zeroLen && nums[numIdx + numLen] != 0) {
					numLen++;
				}
				int swapLen = numLen > zeroLen ? zeroLen : numLen;
				swapByLength(zeroIdx, numIdx, nums, swapLen);
				zeroIdx = zeroIdx + swapLen;
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
