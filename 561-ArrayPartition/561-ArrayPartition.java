// Last updated: 10/1/2026, 9:38:03 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum=0;

        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}