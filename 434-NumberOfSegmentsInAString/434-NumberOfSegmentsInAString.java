// Last updated: 8/14/2026, 11:57:41 AM
class Solution {
    public int countSegments(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }

        return count;
    }
}