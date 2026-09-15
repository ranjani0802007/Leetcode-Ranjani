// Last updated: 9/15/2026, 4:28:18 PM
import java.util.*;

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        long MOD = 1_000_000_007L;

        int n = nums.length;
        long[] pos = new long[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R')
                pos[i] = nums[i] + (long)d;
            else
                pos[i] = nums[i] - (long)d;
        }

        Arrays.sort(pos);

        long ans = 0;
        long prefix = 0;

        for (int i = 0; i < n; i++) {
            ans = (ans + pos[i] * i - prefix) % MOD;
            prefix = (prefix + pos[i]) % MOD;
        }

        return (int) ans;
    }
}