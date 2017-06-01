import java.util.*;

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

    public static void main(String[] args) {
        System.out.println(new SortCharactersByFrequency().frequencySort("tree"));
    }

    public String frequencySort(String s) {
        int R = 128;
        int[] freqs = new int[R];
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            freqs[c]++;
        }
        Map<Integer, ArrayList<Character>> charMap = new HashMap<Integer, ArrayList<Character>>();

        for (char c = 0; c < R; c++) {
            if (freqs[c] != 0) {
                if (!charMap.containsKey(freqs[c])) {
                    charMap.put(freqs[c], new ArrayList<Character>());
                }
                charMap.get(freqs[c]).add(c);
            }
        }
        Arrays.sort(freqs);

        StringBuilder str = new StringBuilder();
        for (int i = freqs.length - 1; i >= 0; i--) {
            if (freqs[i] == 0) {
                break;
            }
            if (freqs[i] != 0) {
                List<Character> charList = charMap.get(freqs[i]);
                if(charList != null) {
                    for (char c : charList) {
                        for (int j = 0; j < freqs[i]; j++) {
                            str.append(c);
                        }
                    }
                    charMap.remove(freqs[i]);
                }
            }
        }
        return str.toString();
    }
}
