import java.util.ArrayList;
import java.util.List;

/*

102. Binary Tree Level Order Traversal

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
 Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7



return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]

*/
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Order = new ArrayList<List<Integer>>();
        generateOrder(Order, new ArrayList<Integer>(), root);
        return Order;
    }

    private void generateOrder(List<List<Integer>> order, ArrayList<Integer> integers, TreeNode root) {
    }
}
