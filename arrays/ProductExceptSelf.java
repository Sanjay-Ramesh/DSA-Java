// Problem: Product of Array Except Self
// Pattern: Prefix × Suffix (Two Pass)
// Difficulty: Medium
// Independence: Guided approach, self coded ✅
// LeetCode: #238

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // From Left to Right (prefix products)
        for(int i = 0; i < nums.length; i++){
            if(i == 0)
                result[i] = 1;
            else
                result[i] = result[i-1] * nums[i-1];
        }

        int right = 1;

        // From Right to Left (multiply suffix products)
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}