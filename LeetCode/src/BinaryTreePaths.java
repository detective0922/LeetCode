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

        StringBuilder strBuilder = new StringBuilder();
        path(root, strBuilder, pathList);
        return pathList;
    }

    public void path(TreeNode node, StringBuilder strBuilder, List<String> pathList) {
        if (node != null) {
            strBuilder.append(node.val);
        } else {
            return;
        }

        if (node.left == null && node.right == null) {
            pathList.add(strBuilder.toString());
        }
        if (node.left !=null) {
            StringBuilder aaa = new StringBuilder()
            path(node.left, strBuilder.append("->"), pathList);
        }
        path(node.right, strBuilder.append("->"), pathList);

    }
}
