// Last updated: 10/1/2026, 9:34:11 AM
class Solution {
    public String restoreString(String s, int[] indices) {

        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }
}