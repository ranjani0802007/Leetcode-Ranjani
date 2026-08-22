// Last updated: 8/22/2026, 11:30:12 AM
1class Solution {
2    public int findMin(int[] nums) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left < right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] < nums[right]) {
12                right = mid;
13            }
14            else if (nums[mid] > nums[right]) {
15                left = mid + 1;
16            }
17            else {
18                right--;
19            }
20        }
21
22        return nums[left];
23    }
24}