import java.util.HashMap;

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

		HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
		for (int i = 0; i < sChars.length; i++) {
			if (sMap.containsKey(sChars[i])) {
				sMap.put(sChars[i], sMap.get(sChars[i])+1);
			} else {
				sMap.put(sChars[i], 1);
			}
		}
		return tChars[tChars.length - 1];
	
	}

}
