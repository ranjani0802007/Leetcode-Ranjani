// Last updated: 8/11/2026, 2:16:07 PM
class Solution {
    public boolean halvesAreAlike(String s) {

        String vowels = "aeiouAEIOU";

        int leftCount = 0;
        int rightCount = 0;

        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                leftCount++;
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                rightCount++;
            }
        }

        return leftCount == rightCount;
    }
}