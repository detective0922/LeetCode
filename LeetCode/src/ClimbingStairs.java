
/*

70. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 

Note: Given n will be a positive integer.

*/

public class ClimbingStairs {
	public int climbStairs(int n) {
		int count = 0;
		int maxTwo = n / 2;
		for (int i = 0; i < maxTwo; i++) {
			int ways = 1;
			for (int j = 0; j < i; j++) {
				ways *= n - j;
			}
			count += ways;
		}
		return count;
	}

}
