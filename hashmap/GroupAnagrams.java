// Problem: Group Anagrams
// Pattern: HashMap (Canonical Key) + computeIfAbsent grouping
// Difficulty: Medium
// Independence: Logic guided, self coded ✅
// LeetCode: #49

import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // For Sorting Array - creates canonical key
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            // For Storing key values with List
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}