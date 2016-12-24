import java.util.Iterator;

/*
136. Single Number

Given an array of integers, every element appears twice except for one. Find that single one.

*/

public class SingleNumber {
	public int singleNumber(int[] nums) {
        int num = 0;
        for (int i : nums) {
			num ^=i;
		}
        return num;
    }

}
