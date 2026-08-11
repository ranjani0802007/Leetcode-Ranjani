// Last updated: 8/11/2026, 2:18:41 PM
class Solution {
    int count = 0;
    int empty = 0;
    int sx, sy;

    public int uniquePathsIII(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != -1) empty++;
                if (grid[i][j] == 1) {
                    sx = i;
                    sy = j;
                }
            }
        }

        dfs(grid, sx, sy, 1);
        return count;
    }

    void dfs(int[][] grid, int x, int y, int visited) {
        int m = grid.length, n = grid[0].length;

        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == -1)
            return;

        if (grid[x][y] == 2) {
            if (visited == empty) count++;
            return;
        }

        int temp = grid[x][y];
        grid[x][y] = -1;

        dfs(grid, x + 1, y, visited + 1);
        dfs(grid, x - 1, y, visited + 1);
        dfs(grid, x, y + 1, visited + 1);
        dfs(grid, x, y - 1, visited + 1);

        grid[x][y] = temp;
    }
}