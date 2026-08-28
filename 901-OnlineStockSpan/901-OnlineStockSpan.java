// Last updated: 8/28/2026, 9:47:24 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        int low = 0;
7        int high = rows * cols - 1;
8
9        while (low <= high) {
10            int mid = low + (high - low) / 2;
11
12            int value = matrix[mid / cols][mid % cols];
13
14            if (value == target) {
15                return true;
16            } else if (value < target) {
17                low = mid + 1;
18            } else {
19                high = mid - 1;
20            }
21        }
22
23        return false;
24    }
25}