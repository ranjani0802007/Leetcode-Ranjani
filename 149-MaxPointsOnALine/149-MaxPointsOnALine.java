// Last updated: 8/14/2026, 12:01:19 PM
import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;

        int ans = 2;

        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0) {
                    dy = 1;           // Vertical line
                } else if (dy == 0) {
                    dx = 1;           // Horizontal line
                } else {
                    if (dx < 0) {     // Keep dx positive
                        dx = -dx;
                        dy = -dy;
                    }

                    int g = gcd(Math.abs(dx), Math.abs(dy));
                    dx /= g;
                    dy /= g;
                }

                String key = dx + "," + dy;
                map.put(key, map.getOrDefault(key, 1) + 1);
                ans = Math.max(ans, map.get(key));
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
