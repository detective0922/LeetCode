import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

import sun.reflect.generics.tree.Tree;

/*

501. Find Mode in Binary Search Tree

Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.

For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

*/


public class FindModeinBinarySearchTree {
	private int maxMode = 0;
	public int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}
		
		Map<Integer, Integer> modeMap = new HashMap<Integer, Integer>();
		findMode(root, modeMap);
		
		List<Integer> modes = new ArrayList<Integer>();
		
		for (Integer key : modeMap.keySet()) {
			if (modeMap.get(key) == maxMode) {
				modes.add(key);
			}
		}
		
		int[] modesArray = new int[modes.size()];
		for (int i = 0; i < modes.size(); i++) {
			modesArray[i] = modes.get(i);
		}
		
		return modesArray;
	}
	
	public void findMode(TreeNode root, Map<Integer, Integer> modeMap){
		if (root == null) {
			return;
		}
		int mode = 1;
		if (modeMap.containsKey(root.val)) {
			mode = modeMap.get(root.val) + 1;
		}
		modeMap.put(root.val, mode);
		if (mode >= maxMode) {
			maxMode = mode;
		}
		findMode(root.left, modeMap);
		findMode(root.right, modeMap);
	}

}
