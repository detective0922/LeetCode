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
        if (root == null){
            return pathList;
        }

    }

    public void path(TreeNode node, List<String> pathList) {

    }
}
