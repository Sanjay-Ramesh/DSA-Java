// Problem: Two Sum II - Input Array Is Sorted
// Pattern: Two Pointer
// Difficulty: Medium
// Independence: Logic self derived, self coded ✅
// LeetCode: #167
// Why: Since array is sorted, two pointers from both ends work perfectly.
//      sum > target → right-- (decrease sum)
//      sum < target → left++ (increase sum)
//      sum == target → found! Return 1-indexed positions.
//      O(n) time, O(1) space — no extra data structure needed.

class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        // Approach 2: if/else if/else (cleaner, safer — 2ms)
        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum < target)
                left++;

            else if(sum > target)
                right--;

            else
                return new int[]{left + 1, right + 1};
        }

        // Approach 1: inner while loops (risky but works — 1ms)
        /*while(left < right){
            while(numbers[left] + numbers[right] < target)
                left++;

            while(numbers[left] + numbers[right] > target)
                right--;

            if(numbers[left] + numbers[right] == target)
                return new int[]{left + 1, right + 1};
        }*/

        return new int[]{-1, -1};
    }
}