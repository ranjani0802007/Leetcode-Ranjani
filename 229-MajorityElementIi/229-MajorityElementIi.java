// Last updated: 8/14/2026, 11:59:34 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int count = 1;
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    ans.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        return ans;
    }
}