// Last updated: 8/14/2026, 12:02:50 PM
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;   // sqrt(0)=0, sqrt(1)=1

        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;

            if (sq == x) return mid;
            if (sq < x) {
                ans = mid;      // possible answer
                left = mid + 1; // search right side
            } else {
                right = mid - 1; // search left side
            }
        }
        return ans;
    }
}
