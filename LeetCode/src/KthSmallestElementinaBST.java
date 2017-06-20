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
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {

        }

        countNode(root, count, k, queue);
    }

    public int countNode(TreeNode root, int count, int k) {

        queue.add(root.left);
        while (!queue.isEmpty()) {
            TreeNode tmpNode = queue.poll();
            if (tmpNode != null) {
                count++;
                queue.add(root.left);
            }
        }
        if (count > k) {

        }

    }

}
