// Last updated: 8/22/2026, 10:02:36 AM
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        for (int n : nums)
8            map.put(n, map.getOrDefault(n, 0) + 1);
9
10        PriorityQueue<Integer> pq =
11            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
12
13        for (int n : map.keySet()) {
14            pq.offer(n);
15
16            if (pq.size() > k)
17                pq.poll();
18        }
19
20        int[] ans = new int[k];
21
22        for (int i = 0; i < k; i++)
23            ans[i] = pq.poll();
24
25        return ans;
26    }
27}