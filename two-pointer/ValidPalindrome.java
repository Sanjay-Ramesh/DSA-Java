// Problem: Valid Palindrome
// Pattern: Two Pointer
// Difficulty: Easy
// Independence: Guided approach, self coded ✅
// LeetCode: #125
// Why: Two pointers from both ends moving inward is O(n) and avoids
//      extra space. Skip non-alphanumeric characters in place instead
//      of cleaning the string first. toLowerCase handles case insensitivity.

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            // Block 1: skip garbage on LEFT side
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            // Block 2: skip garbage on RIGHT side
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            // Block 3: Compare valid characters
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;

            // Move both inward for next iteration
            left++;
            right--;
        }
        return true;
    }
}
