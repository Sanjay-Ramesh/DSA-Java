// Problem: Find All Numbers Disappeared in an Array
// Pattern: Frequency Array + ArrayList
// Difficulty: Easy
// Beats: 96.55%
// Independence: Pattern self derived
// LeetCode: #448

import java.util.ArrayList;
import java.util.List;

class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        int[] ans = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++)
            ans[nums[i]] += 1;

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0 && i != 0)
                missing.add(i);
        }
        return missing;
    }
}