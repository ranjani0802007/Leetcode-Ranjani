// Last updated: 8/27/2026, 9:08:10 AM
1import java.util.*;
2
3class Solution {
4    public int sumDistance(int[] nums, String s, int d) {
5        long MOD = 1_000_000_007L;
6
7        int n = nums.length;
8        long[] pos = new long[n];
9
10        for (int i = 0; i < n; i++) {
11            if (s.charAt(i) == 'R')
12                pos[i] = nums[i] + (long)d;
13            else
14                pos[i] = nums[i] - (long)d;
15        }
16
17        Arrays.sort(pos);
18
19        long ans = 0;
20        long prefix = 0;
21
22        for (int i = 0; i < n; i++) {
23            ans = (ans + pos[i] * i - prefix) % MOD;
24            prefix = (prefix + pos[i]) % MOD;
25        }
26
27        return (int) ans;
28    }
29}