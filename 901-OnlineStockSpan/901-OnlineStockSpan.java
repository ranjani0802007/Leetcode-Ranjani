// Last updated: 8/28/2026, 9:45:13 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findFirst(nums, target);
4        int last = findLast(nums, target);
5
6        return new int[]{first, last};
7    }
8
9    private int findFirst(int[] nums, int target) {
10        int low = 0;
11        int high = nums.length - 1;
12        int ans = -1;
13
14        while (low <= high) {
15            int mid = low + (high - low) / 2;
16
17            if (nums[mid] == target) {
18                ans = mid;
19                high = mid - 1;
20            } else if (nums[mid] < target) {
21                low = mid + 1;
22            } else {
23                high = mid - 1;
24            }
25        }
26
27        return ans;
28    }
29
30    private int findLast(int[] nums, int target) {
31        int low = 0;
32        int high = nums.length - 1;
33        int ans = -1;
34
35        while (low <= high) {
36            int mid = low + (high - low) / 2;
37
38            if (nums[mid] == target) {
39                ans = mid;
40                low = mid + 1;
41            } else if (nums[mid] < target) {
42                low = mid + 1;
43            } else {
44                high = mid - 1;
45            }
46        }
47
48        return ans;
49    }
50}