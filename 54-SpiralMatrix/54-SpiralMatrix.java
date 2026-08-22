// Last updated: 8/22/2026, 11:08:42 AM
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5
6        HashSet<Integer> set = new HashSet<>();
7
8        for (int n : nums)
9            set.add(n);
10
11        int ans = 0;
12
13        for (int n : set) {
14
15            if (!set.contains(n - 1)) {
16
17                int current = n;
18                int length = 1;
19
20                while (set.contains(current + 1)) {
21                    current++;
22                    length++;
23                }
24
25                ans = Math.max(ans, length);
26            }
27        }
28
29        return ans;
30    }
31}