// Last updated: 8/11/2026, 2:20:32 PM
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String ans = "";

        for (String w : words) {
            if (w.length() == 1 || set.contains(w.substring(0, w.length() - 1))) {
                set.add(w);
                if (w.length() > ans.length()) ans = w;
            }
        }
        return ans;
    }
}