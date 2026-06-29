// Problem: Smaller Numbers Than Current
// Pattern: Sort + HashMap (Optimised)
// Difficulty: Easy
// Beats: 61.45%
// Independence: Brute force independent 🔥, HashMap guided
// LeetCode: #1365
// Note: Brute force O(n²) included as comment, optimised O(n log n)

import java.util.Arrays;
import java.util.HashMap;

class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] copy_nums = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            copy_nums[i] = nums[i];

        Arrays.sort(copy_nums);
        map.put(copy_nums[0], 0);

        for (int i = 1; i < copy_nums.length; i++) {
            if (map.containsKey(copy_nums[i]))
                continue;
            else
                map.put(copy_nums[i], i);
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}

// Brute Force O(n²):
// for(int i=0; i < nums.length; i++){
//     for(int j=0; j < nums.length; j++){
//         if(nums[i] > nums[j] && nums[i] != nums[j])
//             ans[i] += 1;
//     }
// }