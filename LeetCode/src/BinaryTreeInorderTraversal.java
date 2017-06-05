import java.util.ArrayList;
import java.util.List;

/*

94. Binary Tree Inorder Traversal

Given a binary tree, return the inorder traversal of its nodes' values.

For example:
 Given binary tree [1,null,2,3],

   1
    \
     2
    /
   3


return [1,3,2].

*/
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        inorderTraversal(inorder, root);
        return inorder;
    }

    public void inorderTraversal(List<Integer> inorder, TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(inorder, root.left);
        inorder.add(root.val);
        inorderTraversal(inorder, root.right);
    }
}
