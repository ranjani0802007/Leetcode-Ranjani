// Last updated: 8/22/2026, 11:22:08 AM
1class Solution {
2
3    public String longestPalindrome(String s) {
4
5        if (s.length() < 2)
6            return s;
7
8        int start = 0;
9        int end = 0;
10
11        for (int i = 0; i < s.length(); i++) {
12
13            int len1 = expand(s, i, i);
14            int len2 = expand(s, i, i + 1);
15
16            int len = Math.max(len1, len2);
17
18            if (len > end - start + 1) {
19
20                start = i - (len - 1) / 2;
21                end = i + len / 2;
22            }
23        }
24
25        return s.substring(start, end + 1);
26    }
27
28    private int expand(String s, int left, int right) {
29
30        while (left >= 0 &&
31               right < s.length() &&
32               s.charAt(left) == s.charAt(right)) {
33
34            left--;
35            right++;
36        }
37
38        return right - left - 1;
39    }
40}