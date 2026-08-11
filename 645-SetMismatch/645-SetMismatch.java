// Last updated: 8/11/2026, 2:20:47 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];

        // Count frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        int duplicate = -1;
        int missing = -1;

        // Find duplicate and missing number
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            }
            if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}