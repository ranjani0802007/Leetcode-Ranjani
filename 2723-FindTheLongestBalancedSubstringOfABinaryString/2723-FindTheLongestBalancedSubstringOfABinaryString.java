// Last updated: 8/11/2026, 2:14:55 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int zero = 0;
        int one = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {

                // A new block of 0's starts after a block of 1's
                if (i > 0 && s.charAt(i - 1) == '1') {
                    zero = 0;
                    one = 0;
                }

                zero++;
            } else {
                one++;
                ans = Math.max(ans, 2 * Math.min(zero, one));
            }
        }

        return ans;
    }
}