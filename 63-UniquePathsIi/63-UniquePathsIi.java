// Last updated: 8/14/2026, 12:03:13 PM
class Solution {
    int[][] dp;
    int fun(int i, int j, int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if (i >= m || j >= n || grid[i][j] == 1)
            return 0;
        if (i == m - 1 && j == n - 1)
            return 1;
        if (dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = fun(i + 1, j, grid) + fun(i, j + 1, grid);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        dp = new int[m][n];

        for (int[] row : dp)
            java.util.Arrays.fill(row, -1);

        return fun(0, 0, obstacleGrid);
    }
}