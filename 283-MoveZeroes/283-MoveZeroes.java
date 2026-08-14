// Last updated: 8/14/2026, 11:59:03 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int i,c=0;
        int n= nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }
        }
        for(i=c;i<n;i++){
            nums[i]=0;
        }
        for(i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
}