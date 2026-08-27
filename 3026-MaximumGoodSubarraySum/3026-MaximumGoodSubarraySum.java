// Last updated: 8/27/2026, 9:09:45 AM
1import java.util.*;
2
3class Solution {
4    public long maximumSubarraySum(int[] nums, int k) {
5        Map<Long, Long> map = new HashMap<>();
6
7        long prefix = 0;
8        long ans = Long.MIN_VALUE;
9
10        for (int x : nums) {
11
12            long value = x;
13
14            if (map.containsKey(value - k)) {
15                ans = Math.max(ans,
16                        prefix + x - map.get(value - k));
17            }
18
19            if (map.containsKey(value + k)) {
20                ans = Math.max(ans,
21                        prefix + x - map.get(value + k));
22            }
23
24            map.put(value,
25                    Math.min(map.getOrDefault(value, Long.MAX_VALUE),
26                             prefix));
27
28            prefix += x;
29        }
30
31        return ans == Long.MIN_VALUE ? 0 : ans;
32    }
33}