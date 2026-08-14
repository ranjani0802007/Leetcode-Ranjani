// Last updated: 8/14/2026, 12:01:37 PM
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++)
            x=x^nums[i];
        //System.out.print(x);
        return x;
        
    }
}