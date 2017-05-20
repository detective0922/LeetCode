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
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        root.left = two;
        root.right = three;
        two.left = four;
        three.left = five;
        three.right = six;
        five.left = seven;
        System.out.println(new FindLargestValueinEachTreeRow().largestValues(root));
    }
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

    //a solution with BFS
    /*while (!queue.isEmpty()) {
        int size = queue.size();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            max = Math.max(max, node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        res.add(max);
    }*/

}
