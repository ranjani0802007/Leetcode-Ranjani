// Last updated: 9/15/2026, 4:27:33 PM
import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (char c : word.toCharArray())
            freq[c - 'a']++;

        Arrays.sort(freq);

        int ans = 0;
        int position = 1;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) continue;

            ans += freq[i] * position;

            if ((25 - i + 1) % 8 == 0)
                position++;
        }

        return ans;
    }
}