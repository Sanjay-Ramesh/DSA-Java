// Problem: Concatenation of Array
// Pattern: Array Manipulation
// Difficulty: Easy
// Beats: 96.64%
// Independence: CodeIO concept, self coded
// LeetCode: #1929

class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}