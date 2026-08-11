// Last updated: 8/11/2026, 2:13:35 PM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target) cnt++;
                if (2 * cnt > (j - i + 1))
                    ans++;
            }
        }
        return ans;
    }
}