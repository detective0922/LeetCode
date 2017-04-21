/*
111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

*/
public class MinimumDepthofBinaryTree {

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
        System.out.println(new MinimumDepthofBinaryTree().minDepth(root));
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left != null && root.right != null){
            int leftDepth = minDepth(root.left, 1);
            int rightDepth = minDepth(root.right, 1);
            return leftDepth < rightDepth ? leftDepth : rightDepth;
        } else if (root.left != null) {
            return minDepth(root.left, 1);
        } else {
            return minDepth(root.right, 1);
        }
    }

    public static int minDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth++;
        if (node.left == null && node.right == null) {
            return depth;
        } else if (node.left != null && node.right != null) {
            int leftDepth = minDepth(node.left, depth);
            int rightDepth = minDepth(node.right, depth);
            return leftDepth < rightDepth ? leftDepth : rightDepth;
        } else if (node.left != null) {
            return minDepth(node.left, depth);
        } else {
            return minDepth(node.right, depth);
        }
    }
}
