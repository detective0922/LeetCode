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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> nodeList = new ArrayList<Integer>();
        Map<Integer, TreeNode> nodeMap = new HashMap<Integer, TreeNode>();
        int depth = 0;
        bfs(nodeList, nodeMap, root, depth);
        return nodeList;
    }

    private void bfs(List<Integer> nodeList, Map<Integer, TreeNode> nodeMap, TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            if (depth > nodeMap.size()) {
                nodeList.add(nodeMap.get(depth - 1).val);
            }
            nodeMap.put(depth, root);
        }
    }
}
