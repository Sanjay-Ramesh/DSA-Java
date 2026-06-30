// Problem: Top K Frequent Elements
// Pattern: HashMap + PriorityQueue (Top K / Min-Heap)
// Difficulty: Medium
// Independence: Heavily guided (new concept - PriorityQueue), self coded after understanding ✅
// LeetCode: #347

import java.util.*;

class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // For HashMap
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Storing HashMap data into PriorityQueue
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            int[] box = new int[]{key, value};
            pq.add(box);

            if (pq.size() > k)
                pq.poll();
        }

        int[] result = new int[k];
        int count = 0;

        // Extracting key values
        while (pq.size() > 0) {
            result[count] = pq.poll()[0];
            count++;
        }
        return result;
    }
}