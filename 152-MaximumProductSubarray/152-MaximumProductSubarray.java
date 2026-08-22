// Last updated: 8/22/2026, 11:17:35 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int max = nums[0];
5        int min = nums[0];
6        int ans = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            int n = nums[i];
11
12            if (n < 0) {
13                int temp = max;
14                max = min;
15                min = temp;
16            }
17
18            max = Math.max(n, max * n);
19            min = Math.min(n, min * n);
20
21            ans = Math.max(ans, max);
22        }
23
24        return ans;
25    }
26}