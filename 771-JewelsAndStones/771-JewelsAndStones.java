// Last updated: 10/1/2026, 9:36:50 AM
import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();

        for (char c : jewels.toCharArray())
            set.add(c);

        int count = 0;

        for (char c : stones.toCharArray()) {
            if (set.contains(c))
                count++;
        }

        return count;
    }
}