// Last updated: 8/14/2026, 12:34:26 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length())
5            return "";
6
7        int[] count = new int[128];
8
9        for (char c : t.toCharArray())
10            count[c]++;
11
12        int left = 0;
13        int required = t.length();
14
15        int start = 0;
16        int minLength = Integer.MAX_VALUE;
17
18        for (int right = 0; right < s.length(); right++) {
19
20            if (count[s.charAt(right)] > 0)
21                required--;
22
23            count[s.charAt(right)]--;
24
25            while (required == 0) {
26
27                if (right - left + 1 < minLength) {
28                    minLength = right - left + 1;
29                    start = left;
30                }
31
32                count[s.charAt(left)]++;
33
34                if (count[s.charAt(left)] > 0)
35                    required++;
36
37                left++;
38            }
39        }
40
41        return minLength == Integer.MAX_VALUE
42                ? ""
43                : s.substring(start, start + minLength);
44    }
45}