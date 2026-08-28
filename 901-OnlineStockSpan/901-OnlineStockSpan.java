// Last updated: 8/28/2026, 9:32:07 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12
13            // Left half is sorted
14            if (nums[low] <= nums[mid]) {
15                if (nums[low] <= target && target < nums[mid]) {
16                    high = mid - 1;
17                } else {
18                    low = mid + 1;
19                }
20            }
21            // Right half is sorted
22            else {
23                if (nums[mid] < target && target <= nums[high]) {
24                    low = mid + 1;
25                } else {
26                    high = mid - 1;
27                }
28            }
29        }
30
31        return -1;
32    }
33}