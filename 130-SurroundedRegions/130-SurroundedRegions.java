// Last updated: 8/14/2026, 12:01:43 PM
class Solution {

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Check first and last column
        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0);
            dfs(board, i, cols - 1);
        }

        // Check first and last row
        for (int j = 0; j < cols; j++) {
            dfs(board, 0, j);
            dfs(board, rows - 1, j);
        }

        // Convert surrounded O to X and T back to O
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {

        int rows = board.length;
        int cols = board[0].length;

        // Base condition
        if (row < 0 || row >= rows ||
            col < 0 || col >= cols ||
            board[row][col] != 'O') {
            return;
        }

        // Mark as safe
        board[row][col] = 'T';

        // Explore 4 directions
        dfs(board, row + 1, col); // Down
        dfs(board, row - 1, col); // Up
        dfs(board, row, col + 1); // Right
        dfs(board, row, col - 1); // Left
    }
}