// Last updated: 9/15/2026, 4:28:13 PM
import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        HashSet<String> set = new HashSet<>();

        int count = 0;

        for (String word : words) {

            String rev = new StringBuilder(word).reverse().toString();

            if (set.contains(rev)) {
                count++;
            } else {
                set.add(word);
            }
        }

        return count;
    }
}