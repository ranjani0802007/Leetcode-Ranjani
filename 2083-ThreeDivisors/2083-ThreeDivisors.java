// Last updated: 8/11/2026, 2:15:39 PM
class Solution {
    public boolean isThree(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                if (i < 2) return false;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) return false;
                }
                return true;
            }
        }
        return false;
    }
}
