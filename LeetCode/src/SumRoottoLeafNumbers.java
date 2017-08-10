/*
129. Sum Root to Leaf Numbers

Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,
    1
   / \
  2   3


The root-to-leaf path 1->2 represents the number 12.
 The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.

*/
public class SumRoottoLeafNumbers {
    private int sum = 0;
    private int maxDepth = 0;
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        int unit = 1;
        int depth = 0;
        Sum(root, depth, unit);
        return sum;
    }

    private void Sum(TreeNode root, int depth, int unit) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            maxDepth = depth;
        }
        if(root.left != null) {
            Sum(root.left, depth + 1, unit * 10);
        }
        if (root.right != null) {
            Sum(root.right, depth + 1, unit * 10);
        }

        sum += root.val * unit;
    }
}
