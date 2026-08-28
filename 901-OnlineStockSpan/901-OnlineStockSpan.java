// Last updated: 8/28/2026, 9:38:54 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8
9            if (nums[mid] == target) {
10                return true;
11            }
12
13            // Cannot determine which side is sorted
14            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
15                low++;
16                high--;
17            }
18            // Left side sorted
19            else if (nums[low] <= nums[mid]) {
20                if (nums[low] <= target && target < nums[mid]) {
21                    high = mid - 1;
22                } else {
23                    low = mid + 1;
24                }
25            }
26            // Right side sorted
27            else {
28                if (nums[mid] < target && target <= nums[high]) {
29                    low = mid + 1;
30                } else {
31                    high = mid - 1;
32                }
33            }
34        }
35
36        return false;
37    }
38}