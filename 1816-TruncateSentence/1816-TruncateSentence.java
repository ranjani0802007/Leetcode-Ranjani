// Last updated: 10/1/2026, 9:33:35 AM
class Solution {
    public String truncateSentence(String s, int k) {

        String[] words = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k; i++) {
            ans.append(words[i]);

            if (i != k - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}