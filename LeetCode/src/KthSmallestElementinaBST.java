import java.util.LinkedList;
import java.util.Queue;

/*
230. Kth Smallest Element in a BST

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
 You may assume k is always valid, 1 ? k ? BST's total elements.

Follow up:
 What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently?
 How would you optimize the kthSmallest routine?


*/
public class KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        int depth = 1;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int leftCount = 1;
        queue.add(root.left);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                leftCount++;
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        if (leftCount > k) {

        }

    }

    public int maxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth++;
        if (node.left == null && node.right == null) {
            return depth;
        }

        int leftDepth = 0;
        if (node.left != null) {
            leftDepth = maxDepth(node.left, depth);
        }

        int rightDepth = 0;
        if (node.right != null) {
            rightDepth = maxDepth(node.right, depth);
        }

        if (leftDepth > rightDepth) {
            return leftDepth;
        } else {
            return rightDepth;
        }
    }


}
