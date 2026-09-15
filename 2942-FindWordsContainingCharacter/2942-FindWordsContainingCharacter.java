// Last updated: 9/15/2026, 4:28:03 PM
import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }

        return ans;
    }
}