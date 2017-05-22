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
public class ConvertBSTtoGreaterTree{
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        addToNodes(root, nodes);
        int sum = 0;
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            int tmp = node.val;
            node.val += sum;
            sum += tmp;
        }
        return root;
    }

    private void addToNodes(TreeNode root, Stack<TreeNode> nodes) {
        nodes.add(root);
        if (root.left != null) {
            addToNodes(root.left, nodes);
        }
        if (root.right != null) {
            addToNodes(root.right, nodes);
        }
    }
}
