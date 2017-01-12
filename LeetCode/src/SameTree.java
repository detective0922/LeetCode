import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


/*

100. Same Tree

Given two binary trees, write a function to check if they are equal or not. 

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.


*/


public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		
		if (p.val != q.val || p == null && q != null || p != null && q == null) {
			return false;
		}
		
		if (p.left != null && p.left != null) {
			return isSameTree(p.left, p.right);
		}
		
		if (p.right != null && p.right != null) {
			return isSameTree(p.right, p.right);
		}
		
		return true;
	}
}
