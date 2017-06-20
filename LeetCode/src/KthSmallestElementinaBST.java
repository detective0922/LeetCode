import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode Null = new TreeNode(3);

        root.right = two;
        root.left = Null;
        System.out.println(new KthSmallestElementinaBST().kthSmallest(root));
    }

    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> dfsList = new ArrayList<TreeNode>();
        dfsList.add(root);
        dfs(root, dfsList);
        return dfsList.get(k - 1).val;
    }

    public void dfs(TreeNode node, List<TreeNode> dfsList) {
        if (node == null) {
            return;
        }
        dfs(node.left, dfsList);
        dfsList.add(node);
        dfs(node.right, dfsList);
    }

}
