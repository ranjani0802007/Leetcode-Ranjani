// Last updated: 10/1/2026, 9:35:35 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        // Find total size
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] ans = new int[size];
        int index = 0;

        // Fill array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq-- > 0) {
                ans[index++] = val;
            }
        }

        return ans;
    }
}