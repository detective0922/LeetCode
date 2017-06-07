import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*

144. Binary Tree Preorder Traversal

Given a binary tree, return the preorder traversal of its nodes' values.

For example:
 Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3



return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?

*/
public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        root.left = four;
        root.right = three;
        four.left = two;
        System.out.println(new BinaryTreePreorderTraversal().preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<Integer>();
        if (root == null) {
            return nodes;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            nodes.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return nodes;
    }


}
