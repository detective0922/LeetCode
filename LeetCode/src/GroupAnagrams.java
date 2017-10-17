
/*

49. Group Anagrams

Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:
[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]


Note: All inputs will be in lower-case.

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> anagramsMap = new HashMap<Integer, List<String>>();
        int key = 0;
        for (String str : strs) {
            char[] chars = str.toCharArray();
            for (char c : chars) {
                key += c;
            }
            if (!anagramsMap.containsKey(key)) {
                anagramsMap.put(key, new ArrayList<String>());
            }
            anagramsMap.get(key).add(str);
        }

    }

}
