import java.util.*;

/*

199. Binary Tree Right Side View

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
 Given the following binary tree,

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

You should return [1, 3, 4].

*/
public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode two = new TreeNode(9);
        TreeNode three = new TreeNode(20);
        TreeNode four = new TreeNode(15);
        TreeNode five = new TreeNode(7);
        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        System.out.println(new BinaryTreeRightSideView().rightSideView(root));
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> vals = new ArrayList<Integer>();
        int depth = 0;
        dfs(vals, root, depth);
        return vals;
    }

    private void dfs(List<Integer> vals, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth == vals.size()) {
            vals.add(root.val);
        }
        depth++;
        dfs(vals, root.right, depth);
        dfs(vals, root.left, depth);
    }
}
