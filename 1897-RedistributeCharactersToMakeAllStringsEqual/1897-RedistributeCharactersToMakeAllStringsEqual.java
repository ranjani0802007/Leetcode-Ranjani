// Last updated: 9/15/2026, 4:29:15 PM
class Solution {
    public boolean makeEqual(String[] words) {

        int[] freq = new int[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
        }

        int n = words.length;

        for (int count : freq) {
            if (count % n != 0) {
                return false;
            }
        }

        return true;
    }
}