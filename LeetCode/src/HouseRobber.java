
/*

198. House Robber

You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected 
and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.


*/

public class HouseRobber {
	public int rob(int[] nums) {
		
		int preRobbed = 0;
		int preNotRobbed = 0;
		for (int i = 0; i < nums.length; i++) {		
			int currentRobbed = preNotRobbed + nums[i];
			int currNotRobbed = Math.max(preNotRobbed, preRobbed);
			preRobbed = currentRobbed;
			preNotRobbed = currNotRobbed;
		}
		
		return Math.max(preRobbed, preNotRobbed);

	}

}
