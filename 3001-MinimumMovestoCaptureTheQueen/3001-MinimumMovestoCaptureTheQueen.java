// Last updated: 8/27/2026, 9:14:17 AM
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3
4        // Rook and queen are in the same row
5        if (a == e) {
6            // Bishop blocks the rook
7            if (!(c == a && Math.min(b, f) < d && d < Math.max(b, f))) {
8                return 1;
9            }
10        }
11
12        // Rook and queen are in the same column
13        if (b == f) {
14            // Bishop blocks the rook
15            if (!(d == b && Math.min(a, e) < c && c < Math.max(a, e))) {
16                return 1;
17            }
18        }
19
20        // Bishop and queen are on the same diagonal
21        if (Math.abs(c - e) == Math.abs(d - f)) {
22
23            // Rook blocks the bishop
24            if (!(Math.abs(a - e) == Math.abs(b - f)
25                    && Math.min(c, e) < a
26                    && a < Math.max(c, e)
27                    && Math.min(d, f) < b
28                    && b < Math.max(d, f))) {
29                return 1;
30            }
31        }
32
33        // No immediate capture
34        return 2;
35    }
36}