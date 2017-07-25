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
        three.left = four;
        three.right = five;
        System.out.println(new BinaryTreeRightSideView().rightSideView(root));
    }
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> nodeMap = new HashMap<Integer, Integer>();
        int depth = 0;
        dfs(nodeMap, root, depth);
        return new ArrayList<Integer>(nodeMap.values());
    }

    private void dfs(Map<Integer, Integer> nodeMap, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        nodeMap.put(depth, root.val);
        depth++;
        dfs(nodeMap, root.left, depth);
        dfs(nodeMap, root.right, depth);
    }
}
