// Problem: Valid Anagram
// Pattern: HashMap (Character Frequency)
// Difficulty: Easy
// Independence: Self coded ✅
// LeetCode: #242

import java.util.HashMap;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) - 1);

        for (int count : map.values()) {
            if (count != 0)
                return false;
        }
        return true;
    }
}