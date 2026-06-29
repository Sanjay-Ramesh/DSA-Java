// Problem: Set Mismatch (Find Error Nums)
// Pattern: Frequency Array
// Difficulty: Easy
// Beats: 94.88%
// Independence: Guided thinking, self coded
// LeetCode: #645

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[nums.length + 1];
        int duplicate = 0;
        int missing = 0;

        for (int i = 0; i < nums.length; i++) {
            ans[nums[i]] += 1;
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] >= 2)
                duplicate = i;
            if (ans[i] == 0 && i != 0)
                missing = i;
        }

        return new int[]{duplicate, missing};
    }
}