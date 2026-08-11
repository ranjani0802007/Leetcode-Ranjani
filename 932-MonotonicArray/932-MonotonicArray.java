// Last updated: 8/11/2026, 2:19:13 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true,dec=true;

        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1])  dec=false;
            if(nums[i] < nums[i-1])  inc=false;
        }
        return inc || dec;
    }
}