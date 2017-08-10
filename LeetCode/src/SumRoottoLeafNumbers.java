import java.util.LinkedList;
import java.util.Queue;

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
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        int unit = 1;
        Sum(root, unit);
        return sum;
    }

    private void Sum(TreeNode root, int unit) {
        if (root == null) {
            return;
        }
        if(root.left != null) {
            Sum(root.left, unit * 10);
        }
        if (root.right != null) {
            Sum(root.right, unit * 10);
        }
        sum += root.val * unit;
    }
}
