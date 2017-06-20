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
        dfs(root, queue);
    }

    public void dfs(TreeNode root, Queue<TreeNode> queue) {
        if (root==null) {
            return;
        }


    }

}
