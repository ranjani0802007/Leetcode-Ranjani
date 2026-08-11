// Last updated: 8/11/2026, 2:22:37 PM
import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i])
                i++;

            j++;
        }

        return i;
    }
}