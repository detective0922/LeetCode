import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*

107. Binary Tree Level Order Traversal II

Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
(ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]


*/

public class BinaryTreeLevelOrderTraversalII {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode two = new TreeNode(9);
		TreeNode three = new TreeNode(20);
		TreeNode four = new TreeNode(15);
		TreeNode five = new TreeNode(7);
		root.left = two;
		root.right = three;
		three.left = four;
		three.right = five;
		System.out.println(new BinaryTreeLevelOrderTraversalII().levelOrderBottom(root));
	}
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		List<List<Integer>> nodeList = new ArrayList<List<Integer>>();
		int depth = 0;
		Order(root, nodeList, depth);
		List<List<Integer>> revNodeList = new ArrayList<List<Integer>>(nodeList.size());
		Collections.reverse(nodeList);
		return nodeList;
	}
	
	public void Order(TreeNode root, List<List<Integer>> nodeList, int depth) {
		if (root == null) {
			return;
		}
		
		if (depth >= nodeList.size()) {
			nodeList.add(new ArrayList<Integer>());
		}
		nodeList.get(depth).add(root.val);
		
		depth++;
		Order(root.left, nodeList, depth);
		Order(root.right, nodeList, depth);
				
	}

}
