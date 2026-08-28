// Last updated: 8/28/2026, 9:27:28 AM
1import java.util.*;
2
3class Solution {
4    public int subarraysWithKDistinct(int[] nums, int k) {
5        return atMost(nums, k) - atMost(nums, k - 1);
6    }
7
8    private int atMost(int[] nums, int k) {
9        if (k == 0) {
10            return 0;
11        }
12
13        Map<Integer, Integer> map = new HashMap<>();
14
15        int left = 0;
16        int result = 0;
17
18        for (int right = 0; right < nums.length; right++) {
19
20            map.put(nums[right],
21                    map.getOrDefault(nums[right], 0) + 1);
22
23            while (map.size() > k) {
24                map.put(nums[left], map.get(nums[left]) - 1);
25
26                if (map.get(nums[left]) == 0) {
27                    map.remove(nums[left]);
28                }
29
30                left++;
31            }
32
33            result += right - left + 1;
34        }
35
36        return result;
37    }
38}