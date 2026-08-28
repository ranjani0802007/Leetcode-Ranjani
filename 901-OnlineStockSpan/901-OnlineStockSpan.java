// Last updated: 8/28/2026, 9:30:08 AM
1public class Solution extends VersionControl {
2    public int firstBadVersion(int n) {
3        int low = 1, high = n;
4
5        while (low < high) {
6            int mid = low + (high - low) / 2;
7
8            if (isBadVersion(mid)) {
9                high = mid;
10            } else {
11                low = mid + 1;
12            }
13        }
14
15        return low;
16    }
17}