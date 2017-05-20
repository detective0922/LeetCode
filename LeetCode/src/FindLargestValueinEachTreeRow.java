import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*

515. Find Largest Value in Each Tree Row

You need to find the largest value in each row of a binary tree.

Example:

Input:

          1
         / \
        3   2
       / \   \
      5   3   9

Output: [1, 3, 9]

*/
public class FindLargestValueinEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxVals = new ArrayList<Integer>();
        if (root == null) {
            return maxVals;
        }
        findMaxVals(root, 0, maxVals);
        return maxVals;
    }

    public void findMaxVals(TreeNode root, int depth, List<Integer> maxVals) {
        if (depth >= maxVals.size()) {
            maxVals.add(root.val);
        } else {
            int preMax = maxVals.get(depth);
            if (root.val > preMax) {
                maxVals.set(depth, root.val);
            }
        }
        if (root.left !=null) {
            findMaxVals(root.left, depth + 1, maxVals);
        }
        if (root.right !=null) {
            findMaxVals(root.right, depth + 1, maxVals);
        }

    }
}
