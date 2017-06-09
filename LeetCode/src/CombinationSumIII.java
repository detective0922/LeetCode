import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

216. Combination Sum III


Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used
and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]




Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]

*/
public class CombinationSumIII {
    public static void main(String[] args) {
        System.out.println(new CombinationSumIII().combinationSum3(3, 9));
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> sums = new ArrayList<List<Integer>>();
        combination(sums, new ArrayList<Integer>(), k, n, 1);
        return sums;
    }

    private void combination(List<List<Integer>> sums, List<Integer> sum,int k, int n, int start) {
        if (sum.size() > k) {
            return;
        }
        if (sum.size() == k && n == 0) {
            sums.add(new ArrayList<Integer>(sum));
        } else {
            for (int i = start; i <= 9 && i <= n; i++) {
                sum.add(i);
                combination(sums, sum, k, n - i, i + 1);
                sum.remove(sum.size() - 1);
            }
        }
    }
}
