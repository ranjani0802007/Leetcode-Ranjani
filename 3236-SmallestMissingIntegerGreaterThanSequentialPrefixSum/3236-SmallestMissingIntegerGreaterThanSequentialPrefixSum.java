// Last updated: 8/11/2026, 2:14:27 PM
import java.util.*;

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        // Find the longest sequential prefix and its sum
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        // Store all elements in a HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Find the smallest missing integer >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}