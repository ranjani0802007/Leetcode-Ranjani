// Last updated: 8/28/2026, 9:42:57 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low < high) {
7            int mid = low + (high - low) / 2;
8
9            if (nums[mid] > nums[high]) {
10                low = mid + 1;
11            } else {
12                high = mid;
13            }
14        }
15
16        return nums[low];
17    }
18}