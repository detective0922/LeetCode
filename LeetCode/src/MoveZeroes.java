

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
		int[] test = { 0, 1, 0, 3, 12 };
		//int[] test = { 0, 0, 3};
		//int[] test = { 1,1,0,4, 3};
		new MoveZeroes().moveZeroes(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + ",");
		}
		System.out.println();
	}

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
			
		}
	}

}
