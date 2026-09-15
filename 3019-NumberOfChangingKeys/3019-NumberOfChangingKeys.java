// Last updated: 9/15/2026, 4:27:30 PM
class Solution {
    public int countKeyChanges(String s) {

        int count = 0;

        s = s.toLowerCase();

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count++;
            }
        }

        return count;
    }
}