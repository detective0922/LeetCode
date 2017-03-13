/*
107. Binary Tree Level Order Traversal II

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST. 

According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).¡± 
        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5


For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. 
Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

*/

public class LowestCommonAncestorofaBinarySearchTree {
	private TreeNode lowestCommonAncestor;
	private int lowest;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || p == null || q == null) {
			return null;
		}
		lowestCommonAncestor = null;
		lowest = 0;
		lowestCommonAncestor(root, p, q, lowest);
		return lowestCommonAncestor;
	}

	public void lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q, int depth) {
		if (root == null || p == null || q == null) {
			return;
		}

		if (isCommonAncestor(root, p, q) && depth > lowest) {
			lowestCommonAncestor = root;
			lowest = depth;
		}
		depth++;
		lowestCommonAncestor(root.left, p, q, depth);
		lowestCommonAncestor(root.right, p, q, depth);

	}

	public boolean isCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || p == null || q == null) {
			return false;
		}

		return isAncestor(root, p) && isAncestor(root, q);
	}

	public boolean isAncestor(TreeNode ancestor, TreeNode descendant) {
		if (ancestor == null || descendant == null) {
			return false;
		}

		return ancestor.val == descendant.val || isAncestor(ancestor.left, descendant)
				|| isAncestor(ancestor.right, descendant);
	}

}
