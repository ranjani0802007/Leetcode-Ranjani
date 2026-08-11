// Last updated: 8/11/2026, 2:14:24 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        long maxDiag = 0;
        int area = 0;

        for (int[] d : dimensions) {

            long diag = 1L * d[0] * d[0] + 1L * d[1] * d[1];
            int currArea = d[0] * d[1];

            if (diag > maxDiag || (diag == maxDiag && currArea > area)) {
                maxDiag = diag;
                area = currArea;
            }
        }

        return area;
    }
}