// Last updated: 10/1/2026, 9:37:16 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int left=0;
        int product=1;
        int count=0;

        for(int right=0;right<nums.length;right++){
            product=product*nums[right];

            while(product>=k){
                product=product/nums[left];
                left++;
            }
            count=count+(right-left+1);
        }
        return count;
    }
}