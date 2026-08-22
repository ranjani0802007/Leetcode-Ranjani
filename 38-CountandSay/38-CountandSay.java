// Last updated: 8/22/2026, 9:54:23 AM
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || numRows >= s.length())
4            return s;
5
6        StringBuilder[] rows = new StringBuilder[numRows];
7
8        for (int i = 0; i < numRows; i++)
9            rows[i] = new StringBuilder();
10
11        int row = 0;
12        int direction = 1;
13
14        for (char c : s.toCharArray()) {
15            rows[row].append(c);
16
17            if (row == 0)
18                direction = 1;
19            else if (row == numRows - 1)
20                direction = -1;
21
22            row += direction;
23        }
24
25        StringBuilder ans = new StringBuilder();
26
27        for (StringBuilder r : rows)
28            ans.append(r);
29
30        return ans.toString();
31    }
32}