
/*
104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/


public class MaximumDepthofBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		root.left = two;
		root.right = three;
		two.left = four;
		three.right = five;
		System.out.println(new MaximumDepthofBinaryTree().maxDepth(root));
	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}
		int leftDepth = 1;
		if (root.left != null) {
			leftDepth = maxDepth(root.left, leftDepth);
		}

		int rightDepth = 1;
		if (root.right != null) {
			rightDepth = maxDepth(root.right, rightDepth);
		}

		if (leftDepth > rightDepth) {
			return leftDepth;
		} else {
			return rightDepth;
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

		int leftDepth = 0;
		if (node.left != null) {
			leftDepth = maxDepth(node.left, depth);
		}

		int rightDepth = 0;
		if (node.right != null) {
			rightDepth = maxDepth(node.right, depth);
		}

		if (leftDepth > rightDepth) {
			return leftDepth;
		} else {
			return rightDepth;
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
