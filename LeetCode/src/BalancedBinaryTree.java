/*

110. Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

*/
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return  false;
        }
    }

    public int depth(TreeNode node, int depth) {
        if (node != null) {
            depth++;
        }

        int leftDepth = 0;
        int rightDepth = 0;

        if(node.left != null) {
            leftDepth = depth(node.left,depth);
        }
        if(node.right != null) {
            rightDepth = depth(node.right,depth);
        }

        return leftDepth > rightDepth ? leftDepth:rightDepth;
    }
}
