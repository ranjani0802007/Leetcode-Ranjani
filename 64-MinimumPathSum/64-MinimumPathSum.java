// Last updated: 8/14/2026, 12:03:10 PM
class Solution {
    int[][] dp;

    int fun(int i, int j, int[][] grid) {
        int m = grid.length, n = grid[0].length;

        if (i >= m || j >= n)
            return Integer.MAX_VALUE;

        if (i == m - 1 && j == n - 1)
            return grid[i][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        int right = fun(i, j + 1, grid);
        int down = fun(i + 1, j, grid);

        return dp[i][j] = grid[i][j] + Math.min(right, down);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new int[m][n];

        for (int[] row : dp)
            java.util.Arrays.fill(row, -1);

        return fun(0, 0, grid);
    }
}