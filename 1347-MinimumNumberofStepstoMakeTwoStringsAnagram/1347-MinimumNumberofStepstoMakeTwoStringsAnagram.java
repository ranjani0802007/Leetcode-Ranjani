// Last updated: 8/22/2026, 11:31:15 AM
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5
6        int n = nums.length;
7        int[] ans = new int[n - k + 1];
8
9        Deque<Integer> deque = new ArrayDeque<>();
10
11        for (int i = 0; i < n; i++) {
12
13            while (!deque.isEmpty() &&
14                   deque.peekFirst() <= i - k) {
15                deque.pollFirst();
16            }
17
18            while (!deque.isEmpty() &&
19                   nums[deque.peekLast()] <= nums[i]) {
20                deque.pollLast();
21            }
22
23            deque.addLast(i);
24
25            if (i >= k - 1)
26                ans[i - k + 1] = nums[deque.peekFirst()];
27        }
28
29        return ans;
30    }
31}