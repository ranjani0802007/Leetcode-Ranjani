// Last updated: 8/22/2026, 10:21:48 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prev = n & 1;
4        n >>= 1;
5
6        while (n > 0) {
7            int current = n & 1;
8
9            if (current == prev)
10                return false;
11
12            prev = current;
13            n >>= 1;
14        }
15
16        return true;
17    }
18}