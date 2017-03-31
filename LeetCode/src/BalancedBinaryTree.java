/*

110. Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

*/
public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode two = new TreeNode(9);
        TreeNode three = new TreeNode(20);
        TreeNode four = new TreeNode(15);
        TreeNode five = new TreeNode(7);
        root.left = null;
        root.right = three;
        three.left = null;
        three.right = five;
        System.out.println(new BalancedBinaryTree().isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = depth(root.left, 0);
        int rightDepth = depth(root.right, 0);

        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode node, int depth) {
        if (node != null) {
            depth++;
        } else {
            return depth;
        }

        int leftDepth = depth(node.left, depth);
        int rightDepth = depth(node.right, depth);

        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}
