import java.util.*;

/*
347. Top K Frequent Elements

Given a non-empty array of integers, return the k most frequent elements.

For example,
 Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note:

•You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
•Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

*/
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int freq = 1;
            if (freqMap.containsKey(num)) {
                freq = freqMap.get(num) + 1;
            }
            freqMap.put(num, freq);
        }

        List<Integer> topK = new ArrayList<Integer>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<Map.Entry<Integer, Integer>>(freqMap.size(), new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        queue.addAll(freqMap.entrySet());
        for (int i = 0; i< k; i++) {
            topK.add(queue.poll().getKey());
        }
        return topK;
    }

}
