// Last updated: 8/11/2026, 2:14:16 PM
import java.util.*;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        long sum = 0;
        long ans = -1;

        for (int num : nums) {
            if (num < sum)
                ans = sum + num;

            sum += num;
        }

        return ans;
    }
}