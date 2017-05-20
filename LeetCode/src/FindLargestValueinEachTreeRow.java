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
    private int currRow;
    private int rowMax;
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxVals = new ArrayList<Integer>();
        if (root == null) {
            return maxVals;
        }
        maxValInRow(root, 0, maxVals);
        return maxVals;
    }

    public void maxValInRow(TreeNode root, int depth, List<Integer> maxVals) {

    }
}
