import java.util.Arrays;

/*
462. Minimum Moves to Equal Array Elements II

Given a non-empty integer array, find the minimum number of moves required to make all array elements equal,
where a move is incrementing a selected element by 1 or decrementing a selected element by 1.

You may assume the array's length is at most 10,000.

Example:
Input:
[1,2,3]

Output:
2

Explanation:
Only two moves are needed (remember each move increments or decrements one element):

[1,2,3]  =>  [2,2,3]  =>  [2,2,2]

*/
public class MinimumMovestoEqualArrayElementsII {

    public static void main(String[] args) {
        int[] test = { 1,0,0,8,6};
        System.out.println(new MinimumMovestoEqualArrayElementsII().minMoves2(test));

    }

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        int moves = 0;
        for (int i = 0; i< nums.length;i++) {
            moves += Math.abs(nums[i] - nums[mid]);
        }
        return moves;
    }

}