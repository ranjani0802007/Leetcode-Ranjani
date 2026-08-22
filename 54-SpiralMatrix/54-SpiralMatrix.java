// Last updated: 8/22/2026, 11:12:50 AM
1import java.util.*;
2
3class Solution {
4    public int subarraySum(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7        map.put(0, 1);
8
9        int sum = 0;
10        int ans = 0;
11
12        for (int n : nums) {
13
14            sum += n;
15
16            ans += map.getOrDefault(sum - k, 0);
17
18            map.put(sum, map.getOrDefault(sum, 0) + 1);
19        }
20
21        return ans;
22    }
23}