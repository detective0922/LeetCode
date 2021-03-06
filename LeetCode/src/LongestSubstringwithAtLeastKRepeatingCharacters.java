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
    public static void main(String[] args) {
        System.out.println(new LongestSubstringwithAtLeastKRepeatingCharacters().longestSubstring("a", 1));
    }

    public int longestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        return helper(chars, 0, s.length() - 1, k);
    }

    private int helper(char[] chars, int start, int end, int k) {
        if (end < start || (end - start + 1) < k) {
            return 0;
        }
        char[] sMap = new char[26];
        for (int i = start; i <= end; i++) {
            sMap[chars[i] - 'a']++;
        }
        for (int i = 0; i < sMap.length; i++) {
            if (sMap[i] > 0 && sMap[i] < k) {
                for (int j = start; j <= end; j++) {
                    if (chars[j] == i + 'a') {
                        int left = helper(chars, start, j - 1, k);
                        int right = helper(chars, j + 1, end, k);
                        return Math.max(left, right);
                    }
                }
            }
        }
        return end - start + 1;
    }
}
