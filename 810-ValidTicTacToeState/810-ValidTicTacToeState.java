// Last updated: 8/11/2026, 2:19:46 PM
class Solution {
    public boolean validTicTacToe(String[] board) {
        int x = 0, o = 0;

        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'X') x++;
                else if (c == 'O') o++;
            }
        }

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

        if (o > x || x > o + 1) return false;
        if (xWin && oWin) return false;
        if (xWin && x != o + 1) return false;
        if (oWin && x != o) return false;

        return true;
    }

    private boolean win(String[] board, char c) {
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == c &&
                board[i].charAt(1) == c &&
                board[i].charAt(2) == c)
                return true;

            if (board[0].charAt(i) == c &&
                board[1].charAt(i) == c &&
                board[2].charAt(i) == c)
                return true;
        }

        if (board[0].charAt(0) == c &&
            board[1].charAt(1) == c &&
            board[2].charAt(2) == c)
            return true;

        if (board[0].charAt(2) == c &&
            board[1].charAt(1) == c &&
            board[2].charAt(0) == c)
            return true;

        return false;
    }
}