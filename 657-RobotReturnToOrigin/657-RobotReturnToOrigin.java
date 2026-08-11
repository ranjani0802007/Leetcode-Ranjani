// Last updated: 8/11/2026, 2:20:43 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'U')
                y++;
            else if (c == 'D')
                y--;
            else if (c == 'L')
                x--;
            else
                x++;
        }

        return x == 0 && y == 0;
    }
}