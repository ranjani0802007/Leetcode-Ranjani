// Last updated: 8/11/2026, 2:14:25 PM
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int maxFreq = Collections.max(map.values());
        int ans = 0;

        for (int freq : map.values())
            if (freq == maxFreq)
                ans += freq;

        return ans;
    }
}