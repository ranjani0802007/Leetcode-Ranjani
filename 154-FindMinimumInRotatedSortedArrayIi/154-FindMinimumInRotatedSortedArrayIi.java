// Last updated: 10/1/2026, 9:40:44 AM
class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            }
            else if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right--;
            }
        }

        return nums[left];
    }
}