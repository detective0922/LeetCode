import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        root.left = null;
        root.right = two;
        two.left = three;
        two.right = null;
        System.out.println(new BinaryTreePreorderTraversal().preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<Integer>();
        if (root == null) {
            return nodes;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            nodes.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return nodes;
    }


}
