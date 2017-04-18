/*
111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

*/
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = 1;
        if (root.left != null) {
            leftDepth = minDepth(root.left, leftDepth);
        }

        int rightDepth = 1;
        if (root.right != null) {
            rightDepth = minDepth(root.right, rightDepth);
        }

        if (leftDepth < rightDepth) {
            return leftDepth;
        } else {
            return rightDepth;
        }

    }

    public static int minDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth++;
        if (node.left == null && node.right == null) {
            return depth;
        }

        int leftDepth = 0;
        if (node.left != null) {
            leftDepth = minDepth(node.left, depth);
        }

        int rightDepth = 0;
        if (node.right != null) {
            rightDepth = minDepth(node.right, depth);
        }

        if (leftDepth < rightDepth) {
            return leftDepth;
        } else {
            return rightDepth;
        }
    }
}
