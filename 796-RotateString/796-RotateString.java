// Last updated: 10/1/2026, 9:36:38 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        return (s + s).contains(goal);
    }
}