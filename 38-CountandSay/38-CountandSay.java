// Last updated: 8/22/2026, 9:53:16 AM
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4
5        for (int k = 1; k < n; k++) {
6            StringBuilder sb = new StringBuilder();
7
8            int i = 0;
9
10            while (i < s.length()) {
11                int j = i;
12
13                while (j < s.length() && s.charAt(j) == s.charAt(i))
14                    j++;
15
16                sb.append(j - i);
17                sb.append(s.charAt(i));
18
19                i = j;
20            }
21
22            s = sb.toString();
23        }
24
25        return s;
26    }
27}