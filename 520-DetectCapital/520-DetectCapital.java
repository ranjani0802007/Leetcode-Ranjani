// Last updated: 8/11/2026, 2:22:00 PM
class Solution {
    public boolean detectCapitalUse(String word) {

        if (word.equals(word.toUpperCase()))
            return true;

        if (word.equals(word.toLowerCase()))
            return true;

        String first =
                Character.toUpperCase(word.charAt(0))
                + word.substring(1).toLowerCase();

        return word.equals(first);
    }
}