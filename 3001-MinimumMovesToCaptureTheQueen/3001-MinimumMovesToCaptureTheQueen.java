// Last updated: 9/15/2026, 4:27:43 PM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {

        // Rook and queen are in the same row
        if (a == e) {
            // Bishop blocks the rook
            if (!(c == a && Math.min(b, f) < d && d < Math.max(b, f))) {
                return 1;
            }
        }

        // Rook and queen are in the same column
        if (b == f) {
            // Bishop blocks the rook
            if (!(d == b && Math.min(a, e) < c && c < Math.max(a, e))) {
                return 1;
            }
        }

        // Bishop and queen are on the same diagonal
        if (Math.abs(c - e) == Math.abs(d - f)) {

            // Rook blocks the bishop
            if (!(Math.abs(a - e) == Math.abs(b - f)
                    && Math.min(c, e) < a
                    && a < Math.max(c, e)
                    && Math.min(d, f) < b
                    && b < Math.max(d, f))) {
                return 1;
            }
        }

        // No immediate capture
        return 2;
    }
}