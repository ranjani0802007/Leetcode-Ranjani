// Last updated: 9/29/2026, 9:24:02 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k<=1){
4            return 0;
5        }
6        int left=0;
7        int product=1;
8        int count=0;
9
10        for(int right=0;right<nums.length;right++){
11            product=product*nums[right];
12
13            while(product>=k){
14                product=product/nums[left];
15                left++;
16            }
17            count=count+(right-left+1);
18        }
19        return count;
20    }
21}