// Last updated: 8/22/2026, 9:43:50 AM
1import java.util.*;
2
3class Solution {
4    public int minimumPushes(String word) {
5        int[] freq = new int[26];
6
7        for (char c : word.toCharArray())
8            freq[c - 'a']++;
9
10        Arrays.sort(freq);
11
12        int ans = 0;
13        int position = 1;
14
15        for (int i = 25; i >= 0; i--) {
16            if (freq[i] == 0) continue;
17
18            ans += freq[i] * position;
19
20            if ((25 - i + 1) % 8 == 0)
21                position++;
22        }
23
24        return ans;
25    }
26}