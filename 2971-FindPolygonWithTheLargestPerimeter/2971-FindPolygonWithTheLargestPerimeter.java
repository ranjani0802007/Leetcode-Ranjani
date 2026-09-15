// Last updated: 9/15/2026, 4:27:45 PM
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