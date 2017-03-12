import java.util.ArrayList;
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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		ArrayList<ArrayList<Integer>> nodeList = new ArrayList<ArrayList<Integer>>();
		int depth = 0;
		
	}
	
	public void Order(TreeNode root, ArrayList<ArrayList<Integer>> nodeList, int depth) {
		if (root == null) {
			return;
		}
		
		List<Integer> lvlList = nodeList.get(depth);
		if (lvlList == null) {
			lvlList = new ArrayList<Integer>();
		}
		lvlList.add(root.val);
		
		
	}

}
