
/*

70. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 

Note: Given n will be a positive integer.

*/

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;
        for (int i = 2; i < n; i++) {
            ways[n] = ways[n - 1] + ways[n - 2];
        }

    }

}
