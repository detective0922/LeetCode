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

		if (p == null || q == null || p.val != q.val) {
			return false;
		} else {
			return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		
	}
}
