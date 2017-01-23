import java.util.Map;

/*
459. Repeated Substring Pattern 

Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
You may assume the given string consists of lowercase English letters only and its length will not exceed 10000. 

Example 1:

Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.

Example 2:

Input: "aba"

Output: False

Example 3:

Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)

*/

public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String str) {
		int[] counts = new int[26];
		for (int i = 0; i < str.length(); i++) {
			counts[str.charAt(i) - 'a']++;
		}
		
		int copies = 0;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				copies = counts[i];
			}
		}
		
	}

}
