// Problem: Shuffle the Array
// Pattern: Array Manipulation (Index Mapping)
// Difficulty: Easy
// Beats: 100%
// Independence: CodeIO concept, self coded
// LeetCode: #1470

class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];       // ans[0] = nums[0], ans[2] = nums[1]...
            ans[2 * i + 1] = nums[i + n]; // ans[1] = nums[n], ans[3] = nums[n+1]...
        }
        return ans;
    }
}