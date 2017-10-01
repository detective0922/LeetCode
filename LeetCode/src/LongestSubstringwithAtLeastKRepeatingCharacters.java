/*
395. Longest Substring with At Least K Repeating Characters

Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.

Example 1:
Input:
s = "aaabb", k = 3

Output:
3

The longest substring is "aaa", as 'a' is repeated 3 times.


Example 2:
Input:
s = "ababbc", k = 2

Output:
5

The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.


*/
public class LongestSubstringwithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        char[] sMap = new char[128];
        char[] chars = s.toCharArray();
        return helper(chars, 0, s.length(), sMap, k);
    }

    private int helper(char[] chars, int start, int end, char[] sMap, int k) {
        if (end >= start || (end-start) < k) {
            return 0;
        }

    }
}
