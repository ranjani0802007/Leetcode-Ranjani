// Last updated: 8/22/2026, 11:26:53 AM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.trim().split("\\s+");
5
6        StringBuilder ans = new StringBuilder();
7
8        for (int i = words.length - 1; i >= 0; i--) {
9
10            ans.append(words[i]);
11
12            if (i != 0)
13                ans.append(" ");
14        }
15
16        return ans.toString();
17    }
18}