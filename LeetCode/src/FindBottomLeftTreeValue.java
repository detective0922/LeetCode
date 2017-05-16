import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*

513. Find Bottom Left Tree Value

Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:

Input:

    2
   / \
  1   3

Output:
1

 Example 2:

Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7

Note: You may assume the tree (i.e., the given root node) is not NULL.

*/
public class FindBottomLeftTreeValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        root.left = two;
        root.right = three;
        two.left = four;
        three.left = five;
        three.right = six;
        five.left = seven;
        System.out.println(new FindBottomLeftTreeValue().findBottomLeftValue(root));
    }

    private int maxDepth = 0;
    private int leftMost = 0;
    public int findBottomLeftValue(TreeNode root) {
        int depth = 0;
        leftMost = root.val;
        recordLeft(root, depth);
        return leftMost;
    }

    public void recordLeft(TreeNode node, int depth) {
        if (depth > maxDepth) {
            maxDepth = depth;
            leftMost = node.val;
        }
        if (node.left != null) {
            recordLeft(node.left, depth + 1);
        }
        if (node.right != null) {
            recordLeft(node.right, depth + 1);
        }
    }
}
