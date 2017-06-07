import java.util.ArrayList;
import java.util.List;

/*
392. Is Subsequence

Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string,
and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.

Follow up:
 If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence.
 In this scenario, how would you change your code?


*/
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("acb", "ahbgdc"));
    }
    public boolean isSubsequence(String s, String t) {
        List<Integer>[] tMap = new List[128];
        char[] tArray = t.toCharArray();
        for (int i = 0; i< tArray.length;i++) {
            if (tMap[tArray[i]] == null) {
                tMap[tArray[i]] = new ArrayList<Integer>();
            }
            tMap[tArray[i]].add(i);
        }

        char[] sArray = s.toCharArray();
        int index = -1;
        for (char c: sArray) {
            if (tMap[c] == null) {
                return false;
            }
            index = BinarySearch(tMap[c], index);
            if (index == -1) {
                return false;
            }
        }
        return true;

    }

    private int BinarySearch(List<Integer> indexs, int index) {
        int low = 0;
        int high = indexs.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (indexs.get(mid) < index) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low >= indexs.size() ? -1 : indexs.get(low);
    }
}
