// Problem: Contains Duplicate
// Pattern: HashSet
// Difficulty: Easy
// Independence: Logic self, syntax nudge
// LeetCode: #217

import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
}