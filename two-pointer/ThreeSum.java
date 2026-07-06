// Problem: 3Sum
// Pattern: Two Pointer (Fix one + Two Pointer on rest)
// Difficulty: Medium
// Independence: Guided approach, self coded ✅
// LeetCode: #15
// Why: Sort first — makes duplicates adjacent and enables Two Pointer.
//      Fix nums[i], then Two Pointer finds pairs summing to -nums[i].
//      Two separate duplicate-skip checks needed:
//      1. Skip duplicate i (outer for loop) — avoids reprocessing same fixed number
//      2. Skip duplicate left after finding a triplet (inner while loop) —
//         avoids adding same triplet again within the same i's search
//      O(n²) time, O(1) extra space (excluding output).

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum < 0)
                    left++;
                else if(sum > 0)
                    right--;
                else{
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1])
                        left++;
                }
            }
        }
        return answer;
    }
}