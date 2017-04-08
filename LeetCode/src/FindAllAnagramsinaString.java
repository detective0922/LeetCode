import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*

438. Find All Anagrams in a String

Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:
Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".



Example 2:
Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

*/
public class FindAllAnagramsinaString {
    public static void main(String[] args) {
        System.out.println(new FindAllAnagramsinaString().findAnagrams("aa","bb"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexList = new ArrayList<Integer>();
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();

        for (int i = 0; i < sChars.length - pChars.length + 1; i++) {
            if (isAnagram(sChars, pChars, i, i + pChars.length)) {
                indexList.add(i);
            }
        }
        return indexList;

        //TODO
        //need to improve the efficiency
        //maybe Sliding Window?

    }

    public boolean isAnagram(char[] sChars, char[] pChars, int start, int end) {
        if ((end - start) != pChars.length) {
            return false;
        }
        int[] hash = new int[26];

        for (int i = start; i < end; i++) {
            hash[sChars[i] - 'a']++;
        }

        for (int i = 0; i < pChars.length; i++) {
            hash[pChars[i] - 'a']--;
            if (hash[pChars[i] - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
