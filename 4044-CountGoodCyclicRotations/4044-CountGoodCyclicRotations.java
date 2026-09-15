// Last updated: 9/15/2026, 4:27:13 PM
class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int half=n/2;
        long fhs=0;
        long lhs=0;
        for(int i=0;i<half;i++){
            fhs+=nums[i];
        }
        for(int i=half;i<n;i++){
            lhs+=nums[i];
        }
        int goodrotations=0;
        for(int i=0;i<n;i++){
            if(fhs>lhs){
                goodrotations++;
            }
            int lfh=nums[i];
            int llh=nums[(i+half)%n];
            fhs=fhs-lfh+llh;
            lhs=lhs-llh+lfh;
        }
        return goodrotations;
    }
}