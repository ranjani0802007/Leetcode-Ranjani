// Last updated: 8/22/2026, 11:11:03 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3
4        int n = nums.length;
5        int[] ans = new int[n];
6
7        int prefix = 1;
8
9        for (int i = 0; i < n; i++) {
10            ans[i] = prefix;
11            prefix *= nums[i];
12        }
13
14        int suffix = 1;
15
16        for (int i = n - 1; i >= 0; i--) {
17            ans[i] *= suffix;
18            suffix *= nums[i];
19        }
20
21        return ans;
22    }
23}