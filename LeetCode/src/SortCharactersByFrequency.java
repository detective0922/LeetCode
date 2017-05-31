import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
451. Sort Characters By Frequency

Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:
Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.



Example 2:
Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.



Example 3:
Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.


*/
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        int[] freqs = new int[52];
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            freqs[c - 'a']++;
        }
        Map<Integer, Character> charMap = new HashMap<Integer, Character>();
        for (char c = 'a'; c <= 'Z'; c++) {
            if (freqs[c - 'a'] != 0) {
                charMap.put(freqs[c - 'a'], c);
            }
        }
        Arrays.sort(freqs);

        StringBuilder str = new StringBuilder();
        for (int i = freqs.length - 1; i >=0 ;i--) {
            if (freqs[i]==0) {
                break;
            }
            if (freqs[i] != 0) {
                for (int j = 0;j<freqs[i];j++) {
                    str.append(charMap.get(freqs[i]));
                }
            }
        }
        return str.toString();
    }
}
