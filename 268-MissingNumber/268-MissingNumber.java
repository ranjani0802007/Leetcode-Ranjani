// Last updated: 8/14/2026, 11:59:09 AM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int ans=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
           sum+=nums[i];
        ans=n*(n+1)/2;
        ans=ans-sum;
        return ans;
    }

}