// Last updated: 8/14/2026, 12:01:46 PM
class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: convert to lowercase and remove non-alphanumeric
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Step 2: two-pointer check
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
