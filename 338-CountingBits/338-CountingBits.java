// Last updated: 8/14/2026, 11:58:34 AM
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++)
            ans[i] = ans[i >> 1] + (i & 1);

        return ans;
    }
}