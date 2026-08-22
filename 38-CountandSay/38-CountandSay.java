// Last updated: 8/22/2026, 10:01:25 AM
1import java.util.*;
2
3class Solution {
4    public int fourSumCount(int[] nums1, int[] nums2,
5                            int[] nums3, int[] nums4) {
6
7        HashMap<Integer, Integer> map = new HashMap<>();
8
9        for (int a : nums1) {
10            for (int b : nums2) {
11                int sum = a + b;
12                map.put(sum, map.getOrDefault(sum, 0) + 1);
13            }
14        }
15
16        int ans = 0;
17
18        for (int c : nums3) {
19            for (int d : nums4) {
20                ans += map.getOrDefault(-(c + d), 0);
21            }
22        }
23
24        return ans;
25    }
26}