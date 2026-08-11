// Last updated: 8/11/2026, 2:21:51 PM
class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            ans.append(new StringBuilder(word).reverse());
            ans.append(" ");
        }

        return ans.toString().trim();
    }
}