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
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        root.left = two;
        root.right = three;
        System.out.println(new SumRoottoLeafNumbers().sumNumbers(root));
    }

    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        Sum(root, 0);
        return sum;
    }

    private void Sum(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        if(root.left != null) {
            Sum(root.left, sum * 10);
        }
        if (root.right != null) {
            Sum(root.right, sum * 10);
        }

        sum += root.val;
    }
}
