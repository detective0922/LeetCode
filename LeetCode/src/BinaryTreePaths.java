import java.util.ArrayList;
import java.util.List;

/*

257. Binary Tree Paths

Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:


   1
 /   \
2     3
 \
  5



All root-to-leaf paths are:
["1->2->5", "1->3"]

*/
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> pathList = new ArrayList<String>();
        if (root == null) {
            return pathList;
        }

        StringBuilder path = new StringBuilder();
        path(root, path, pathList);
        return pathList;
    }

    public void path(TreeNode node, StringBuilder path, List<String> pathList) {
        if (node != null) {
            path.append(node.val);
        } else {
            return;
        }

        int len = path.length();
        if (node.left == null && node.right == null) {
            pathList.add(path.toString());
        }
        if (node.left != null) {
            path(node.left, path.append("->"), pathList);
        }
        if (node.right != null) {
            path(node.right, path.append("->"), pathList);
        }
        path.setLength(len);

    }
}
