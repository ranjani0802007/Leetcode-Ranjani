// Last updated: 8/22/2026, 11:09:50 AM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3
4        int total = 0;
5
6        int maxSum = nums[0];
7        int currentMax = 0;
8
9        int minSum = nums[0];
10        int currentMin = 0;
11
12        for (int n : nums) {
13
14            currentMax = Math.max(n, currentMax + n);
15            maxSum = Math.max(maxSum, currentMax);
16
17            currentMin = Math.min(n, currentMin + n);
18            minSum = Math.min(minSum, currentMin);
19
20            total += n;
21        }
22
23        if (maxSum < 0)
24            return maxSum;
25
26        return Math.max(maxSum, total - minSum);
27    }
28}