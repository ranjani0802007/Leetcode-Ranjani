// Last updated: 8/14/2026, 12:13:00 PM
import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        //Arrays.sort(nums);
        //return nums[n / 2];
        /*int count = 1; 
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++; 
            } else {
                count = 1; 
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return nums[n / 2];*/
        int i,c=0,t=0;
        for(i=0;i<n;i++){
            if(c==0)
            t=nums[i];
            if(t==nums[i])c++;
            else c--;
            }
            return t; 
    }
}


    

