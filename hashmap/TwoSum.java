// Problem: Two Sum
// Pattern: HashMap (Complement lookup)
// Difficulty: Easy
// Beats: 63%
// Independence: CodeIO concept, self coded
// LeetCode: #1
// Note: This is brute force O(n²) — HashMap solution is O(n)

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}