import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*

513. Find Bottom Left Tree Value

Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:

Input:

    2
   / \
  1   3

Output:
1

 Example 2:

Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7

Note: You may assume the tree (i.e., the given root node) is not NULL.

*/
public class FindBottomLeftTreeValue {
    private int maxDepth = 0;
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int findBottomLeftValue(TreeNode root) {
        int depth = 0;
        recordLeft(root, depth);
        return map.get(maxDepth);
    }

    public void recordLeft(TreeNode node, int depth) {
        if (depth > maxDepth) {
            maxDepth = depth;
            map.put(maxDepth, node.val);
        }

    }
}
