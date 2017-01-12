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
		Queue<TreeNode> pQueue = new LinkedBlockingQueue<TreeNode>();
		Queue<TreeNode> qQueue = new LinkedBlockingQueue<TreeNode>();
		pQueue.offer(p);
		qQueue.offer(q);
		while (!pQueue.isEmpty() && !qQueue.isEmpty()) {
			TreeNode pNode = pQueue.poll();
			TreeNode qNode = qQueue.poll();
			if (pNode.val == qNode.val) {
				if (pNode.left != null && pNode.right != null) {
					pQueue.offer(pNode.left);
					qQueue.offer(qNode.left);
				}
			}
		}
	}
}
