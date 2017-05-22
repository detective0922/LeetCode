import java.util.Stack;

/*

538. Convert BST to Greater Tree

Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to
the original key plus sum of all keys greater than the original key in BST.

Example:
Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13

*/
public class ConvertBSTtoGreaterTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(13);
        root.left = two;
        root.right = three;
        System.out.println(new ConvertBSTtoGreaterTree().convertBST(root));
    }

    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val += sum;
        sum = root.val;
        convertBST(root.left);
        return root;
    }
}
