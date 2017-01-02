
/*
104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/


public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int depth = 1;
		if (root.left == null && root.right == null) {
			return depth;
		}
		int leftDepth = 1;
		if (root.left != null) {

		}

		int rightDepth = 1;
		if (root.right != null) {

		}

	}
	
	public static int maxDepth(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		}
		depth++;
		if (node.left == null && node.right == null) {
			return depth;
		}
		
		if (node.left != null) {
			return maxDepth(node.left, depth);
		}

		if (node.right != null) {
			return maxDepth(node.right, depth);
		}
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
