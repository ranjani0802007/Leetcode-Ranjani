// Last updated: 8/14/2026, 11:58:58 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        java.util.HashMap<Character, String> map = new java.util.HashMap<>();
        java.util.HashMap<String, Character> rev = new java.util.HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i]))
                    return false;
            } else {
                if (rev.containsKey(words[i]))
                    return false;

                map.put(c, words[i]);
                rev.put(words[i], c);
            }
        }

        return true;
    }
}