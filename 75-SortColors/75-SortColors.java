// Last updated: 8/14/2026, 12:02:41 PM
class Solution {
    public void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
            else{
                c2++;
            }

        }
        for(int i=0;i<c0;i++)
            nums[i]=0;
        
        for(int i=c0;i<(c0+c1);i++)
             nums[i]=1;
        
        for(int i=(c1+c0);i<n;i++)
            nums[i]=2;
        
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
        
    }
}