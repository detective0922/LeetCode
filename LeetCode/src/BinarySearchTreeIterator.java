/*

173. Binary Search Tree Iterator

Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.


*/

import java.util.ArrayList;
import java.util.List;

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

public class BinarySearchTreeIterator {
    private List<Integer> intList = new ArrayList<Integer>();
    private int index = 0;
    public BSTIterator(TreeNode root) {
        buildList(root);
    }

    private void buildList(TreeNode root) {
        if (root == null) {
            return;
        }
        buildList(root.left);
        intList.add(root.val);
        buildList(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return index != intList.size();
    }

    /** @return the next smallest number */
    public int next() {
        int ret = intList.get(index);
        index++;
        return ret;
    }
}
