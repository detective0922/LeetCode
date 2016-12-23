

/*

389. Find the Difference

Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.

*/


public class FindTheDifference {
	
	public char findTheDifference(String s, String t) {
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();

		for (int i = 0; i < sChars.length; i++) {
			if (sChars[i] != tChars[i]) {
				return tChars[i];
			}
		}
		return tChars[tChars.length - 1];
	
	}

}
