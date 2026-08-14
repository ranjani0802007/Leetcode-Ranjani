// Last updated: 8/14/2026, 12:04:14 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // pointer for the next position to place non-val element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // place non-val element at position k
                k++;               // move k forward
            }
        }
        
        return k; // number of elements not equal to val
    }
}
