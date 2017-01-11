
/*
404. Sum of Left Leaves

Find the sum of all left leaves in a given binary tree.

Example: 
    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24


*/

public class SumofLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		
		if (root == null) {
			return 0;
		}

		if (root.left == null) {
			return 0;
		}

		return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
		/*int leftsum = 0;
		int rightsum = 0;
		if (root.left != null) {
			leftsum = root.left.val + sumOfLeftLeaves(root.left);
		}

		if (root.right != null) {
			rightsum = sumOfLeftLeaves(root.left);
		}
		return leftsum + rightsum;*/
	}

}

