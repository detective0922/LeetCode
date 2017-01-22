import java.util.HashSet;

/*

202. Happy Number

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/

public class HappyNumber {
	public boolean isHappy(int n) {
		if (n == 1) {
			return true;
		}
		
		HashSet<Integer> sumRec = new HashSet<Integer>();
		int sum = n;
		while (sum != 1) {
			if (!sumRec.add(sum)) {
				return false;
			}
			sum = sumOfDigits(sum);
		}
		return true;

	}
	
	public int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int remainder = num % 10;
			num = num / 10;
			sum += remainder * remainder;
		}
		return sum;
	}

}
