// Last updated: 10/1/2026, 9:34:20 AM
class Solution {
    public int[] runningSum(int[] nums) {
        //int sum=0;
        int n=nums.length;
        /*int res[]=new int[n];
    for(int i=0;i<n;i++){
        sum+=nums[i];
        res[i]=sum;
    }
     return res; */ 
     for(int i=1;i<n;i++)
        nums[i]+=nums[i-1];
    return nums;
 }
    
}