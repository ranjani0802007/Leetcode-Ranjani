// Last updated: 8/22/2026, 11:28:52 AM
1class Solution {
2    public int minSteps(String s, String t) {
3
4        int[] freq = new int[26];
5
6        for (char c : s.toCharArray())
7            freq[c - 'a']++;
8
9        for (char c : t.toCharArray())
10            freq[c - 'a']--;
11
12        int ans = 0;
13
14        for (int x : freq) {
15            if (x > 0)
16                ans += x;
17        }
18
19        return ans;
20    }
21}