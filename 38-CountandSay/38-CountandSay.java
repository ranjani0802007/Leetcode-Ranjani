// Last updated: 8/22/2026, 10:03:46 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3
4        boolean[][] row = new boolean[9][9];
5        boolean[][] col = new boolean[9][9];
6        boolean[][] box = new boolean[9][9];
7
8        for (int i = 0; i < 9; i++) {
9            for (int j = 0; j < 9; j++) {
10
11                if (board[i][j] == '.')
12                    continue;
13
14                int num = board[i][j] - '1';
15                int b = (i / 3) * 3 + j / 3;
16
17                if (row[i][num] || col[j][num] || box[b][num])
18                    return false;
19
20                row[i][num] = true;
21                col[j][num] = true;
22                box[b][num] = true;
23            }
24        }
25
26        return true;
27    }
28}