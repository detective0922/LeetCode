
/*
409. Longest Palindrome

Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
 Assume the length of given string will not exceed 1,010. 

Example:  
Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

*/

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		int[] table = new int[256];
		for (int i = 0; i < s.length(); i++) {
			table[s.charAt(i)]++;
		}
		
		int length = 0;
		boolean hasOdd = false;
		for (int i = 0; i < table.length; i++) {
			if (table[i] % 2 == 0) {
				length += table[i];
			} else {
				length += table[i] - 1;
				hasOdd = true;
			}
		}
		if (hasOdd) {
			length++;
		}
		return length;

	}

}
